package com.example.cafe4u.SearchList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.cafe4u.R;
import com.example.cafe4u.goi_y;
import com.example.cafe4u.home1;

import java.util.ArrayList;

public class kqua_search extends AppCompatActivity {

    ImageButton btn_QuayLai, btn_rcm;

    private ArrayList<QuanCafe> mCafe ;
    private RecyclerView mRecycleCafe;
    private QuanArrayAdapter mCafeAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kqua_search);
        mRecycleCafe = findViewById(R.id.list1);
        mCafe = new ArrayList<>();
        createCafeList();
        mCafeAdapter = new QuanArrayAdapter(this,mCafe);
        mRecycleCafe.setAdapter(mCafeAdapter);
        mRecycleCafe.setLayoutManager(new LinearLayoutManager(this));
        addControl();
        addEvent();
    }

    private void addControl() {
        btn_QuayLai = findViewById(R.id.btn_Quaylai);
        btn_rcm = findViewById(R.id.btn_rcm);
    }

    private void addEvent() {
        btn_QuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(kqua_search.this, home1.class);
                startActivity(back);
            }
        });
        btn_rcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(kqua_search.this, goi_y.class);
                startActivity(i);
            }
        });
    }

    private void createCafeList() {
        mCafe.add(new QuanCafe(0, "Thor",1,"khong gian nho, phucj vu kem"));
        mCafe.add(new QuanCafe(0,"IronMan",2,"thai do nhan vien tot nhg menu it mon"));
        mCafe.add(new QuanCafe(0,"Hulk",3,"khong gian nho, phucj vu kem"));
        mCafe.add(new QuanCafe(0,"SpiderMan",4,"khong gian nho, phucj vu kem"));
        mCafe.add(new QuanCafe(0,"Thor",5,"nhan vien phuc vu kem "));
        mCafe.add(new QuanCafe(0,"IronMan",4,"10 d k co nhung"));
        mCafe.add(new QuanCafe(0,"Hulk",3,"thai do nhan vien tot nhg menu it mon"));
        mCafe.add(new QuanCafe(0,"SpiderMan",2,"khong gian nho, phucj vu kem"));
        mCafe.add(new QuanCafe(0,"Thor",1,"thai do nhan vien tot nhg menu it mon"));
        mCafe.add(new QuanCafe(0,"IronMan",2,"khong gian nho, phucj vu kem"));
    }

}
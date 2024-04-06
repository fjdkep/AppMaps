package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.cafe4u.SearchList.QuanArrayAdapter;
import com.example.cafe4u.SearchList.QuanCafe;
import com.example.cafe4u.SearchList.kqua_search;

import java.util.ArrayList;

public class goi_y extends AppCompatActivity {
    //khai bao bien giao dien
    ImageButton btn_Quaylai;
    private ArrayList<QuanCafe> recommentCafe ;
    private RecyclerView mRecycleCafe;
    private QuanArrayAdapter mCafeAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goi_y);
        mRecycleCafe = findViewById(R.id.listRcm);
        recommentCafe = new ArrayList<>();
        createCafeList();
        mCafeAdapter = new QuanArrayAdapter(this,recommentCafe);
        mRecycleCafe.setAdapter(mCafeAdapter);
        mRecycleCafe.setLayoutManager(new LinearLayoutManager(this));

        addControl();
        addEvent();

    }

    private void addEvent() {
        btn_Quaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(goi_y.this, kqua_search.class);
                startActivity(back);
            }
        });
    }

    private void addControl() {
        btn_Quaylai = findViewById(R.id.btn_Quaylai);
    }

    private void createCafeList() {
        recommentCafe.add(new QuanCafe(0, "Thor",1,"khong gian nho, phucj vu kem"));
        recommentCafe.add(new QuanCafe(0,"IronMan",2,"thai do nhan vien tot nhg menu it mon"));
        recommentCafe.add(new QuanCafe(0,"Hulk",3,"khong gian nho, phucj vu kem"));
        recommentCafe.add(new QuanCafe(0,"SpiderMan",4,"khong gian nho, phucj vu kem"));
    }
}
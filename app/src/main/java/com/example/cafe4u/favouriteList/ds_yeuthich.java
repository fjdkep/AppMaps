package com.example.cafe4u.favouriteList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.cafe4u.R;
import com.example.cafe4u.SearchList.QuanArrayAdapter;
import com.example.cafe4u.SearchList.QuanCafe;
import com.example.cafe4u.chitiet_quan;
import com.example.cafe4u.goi_y;
import com.example.cafe4u.home1;

import java.util.ArrayList;

public class ds_yeuthich extends AppCompatActivity {
    //khai bao bien giao dien
    ImageButton btn_QuayLai;
    private ArrayList<QuanCafe> favouriteCafe ;
    private RecyclerView mRecycleCafe;
    private QuanArrayAdapter mCafeAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ds_yeuthich);
        mRecycleCafe = findViewById(R.id.listFavourite);
        favouriteCafe = new ArrayList<>();
        createCafeList();
        mCafeAdapter = new QuanArrayAdapter(this,favouriteCafe);
        mRecycleCafe.setAdapter(mCafeAdapter);
        mRecycleCafe.setLayoutManager(new LinearLayoutManager(this));
        //anh xa Id cho cac bien giao dien

        addControl();
        addEvent();
    }

    private void addEvent() {

        btn_QuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ds_yeuthich.this, home1.class);
                startActivity(back);
            }
        });
    }

    private void addControl() {
        btn_QuayLai = findViewById(R.id.btn_Quaylai);
    }


    //laytt tu csdl
    private void createCafeList() {
        favouriteCafe.add(new QuanCafe(0, "Thor",1,"khong gian nho, phucj vu kem"));
        favouriteCafe.add(new QuanCafe(0,"IronMan",2,"thai do nhan vien tot nhg menu it mon"));
        favouriteCafe.add(new QuanCafe(0,"Hulk",3,"khong gian nho, phucj vu kem"));
        favouriteCafe.add(new QuanCafe(0,"SpiderMan",4,"khong gian nho, phucj vu kem"));
        favouriteCafe.add(new QuanCafe(0,"Thor",5,"nhan vien phuc vu kem "));
        favouriteCafe.add(new QuanCafe(0,"IronMan",4,"10 d k co nhung"));
        favouriteCafe.add(new QuanCafe(0,"Hulk",3,"thai do nhan vien tot nhg menu it mon"));
        favouriteCafe.add(new QuanCafe(0,"SpiderMan",2,"khong gian nho, phucj vu kem"));
        favouriteCafe.add(new QuanCafe(0,"Thor",1,"thai do nhan vien tot nhg menu it mon"));
        favouriteCafe.add(new QuanCafe(0,"IronMan",2,"khong gian nho, phucj vu kem"));
    }
}
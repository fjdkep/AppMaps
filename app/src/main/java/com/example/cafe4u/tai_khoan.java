package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.cafe4u.favouriteList.ds_yeuthich;

public class tai_khoan extends AppCompatActivity {
    //khai bao bien giao dien
    ImageButton btn_QuayLai;
    Button btnChange, btnLogOut;
    LinearLayout LnChangePasswd, LnLike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tai_khoan);
        //anh xa Id cho cac bien giao dien
        btn_QuayLai = findViewById(R.id.btn_Quaylai);
        btnChange = findViewById(R.id.btnChange);
        btnLogOut = findViewById(R.id.btnLogOut);
        LnLike = findViewById(R.id.LnLike);
        LnChangePasswd = findViewById(R.id.LnChangePasswd);



        //
        LnChangePasswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChangePasswd = new Intent(tai_khoan.this, doi_mat_khau.class);
                startActivity(ChangePasswd);
            }
        });
        LnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListLike = new Intent(tai_khoan.this, ds_yeuthich.class);
                startActivity(ListLike);
            }
        });
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent out = new Intent(tai_khoan.this, dang_nhap.class);
                startActivity(out);
            }
        });
        btn_QuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(tai_khoan.this, home1.class);
                startActivity(back);
            }
        });
    }
}
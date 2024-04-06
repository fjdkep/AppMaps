package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class dang_nhap extends AppCompatActivity {
    //khai bao bien giao dien
    EditText edtNameUser, edtPasswd;
    RadioButton rbtnSave;
    Button btnLogin, btnRegister, btnLoginByG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_nhap);
        //anh xa Id cho cac bien giao dien
        edtNameUser = findViewById(R.id.edtNameUser);
        edtPasswd = findViewById(R.id.edtPasswd);
        rbtnSave = findViewById(R.id.rbtnSave);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnLoginByG = findViewById(R.id.btnLoginByG);
//        addEvent();

        //xu ly su kien
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Khai bao Intent
                Intent register = new Intent(dang_nhap.this, dang_ky.class);
                //Khoi dong
                startActivity(register);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(dang_nhap.this, home1.class);

                startActivity(login);
            }
        });

    }

}
package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dang_ky extends AppCompatActivity {
    EditText edtNameUser, edtPasswd, edtRewritePasswd, edtPhone;
    Button btnRegister, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_ky);
        // anh xa Id
        edtRewritePasswd = findViewById(R.id.edtRewritePasswd);
        edtNameUser = findViewById(R.id.edtNameUser);
        edtPasswd = findViewById(R.id.edtPasswd);
        edtPhone = findViewById(R.id.edtPhone);
        btnRegister = findViewById(R.id.btnRegister);
        btnCancel = findViewById(R.id.btnCancel);

        //
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //thoat
                finish();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(dang_ky.this, home1.class);
                startActivity(home);
            }
        });
    }
}
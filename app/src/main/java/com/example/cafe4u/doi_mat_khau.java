package com.example.cafe4u;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class doi_mat_khau extends AppCompatActivity {
    //Khai bao bien
    EditText edtOldPasswd, edtNewPasswd, edtRewriteNewPasswd;
    Button btnSave, btnCancel;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doi_mat_khau);
        // anh xa Id
        edtOldPasswd = findViewById(R.id.edtOldPasswd);
        edtNewPasswd = findViewById(R.id.edtNewPasswd);
        edtRewriteNewPasswd = findViewById(R.id.edtRewriteNewPasswd);
        btnCancel = findViewById(R.id.btnCancel);
        btnSave = findViewById(R.id.btnSave);

        //
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
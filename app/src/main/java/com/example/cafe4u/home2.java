package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cafe4u.SearchList.kqua_search;

public class home2 extends AppCompatActivity {

    Button HSearch, Cancel_HSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home2);

       addControl();
       addEvent();
    }



    private void addEvent() {
        HSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home2.this, kqua_search.class);
                startActivity(i);
            }
        });
        Cancel_HSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home2.this, home1.class);
                startActivity(i);
            }
        });
    }

    private void addControl() {
        HSearch = findViewById(R.id.h_search);
        Cancel_HSearch = findViewById(R.id.cancel_h_search);

    }
}
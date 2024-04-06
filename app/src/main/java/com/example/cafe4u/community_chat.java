package com.example.cafe4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.cafe4u.Message.message;
import com.example.cafe4u.Message.messageAdapter;

import java.util.ArrayList;
import java.util.List;

public class community_chat extends AppCompatActivity {
    EditText edtChat;
    ImageButton btn_Quaylai, btn_Picture, btn_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_chat);

        RecyclerView recyclerView = findViewById(R.id.recycle_message);

        List<message> messageList = new ArrayList<message>();
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_account_circle_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_lock_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_phone_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_lock_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_bookmarks_24));
        messageList.add(new message("user2", "hello", R.drawable.btn_viewuser));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_person_24));
        messageList.add(new message("user2", "hello", R.drawable.group_bgmain));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_bookmarks_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_home_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_fmd_good_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_account_circle_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_favorite_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_bookmarks_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_account_circle_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_filter_alt_24));
        messageList.add(new message("user2", "hello", R.drawable.group_bgmain));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_bookmarks_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_home_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_fmd_good_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_account_circle_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_favorite_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_bookmarks_24));
        messageList.add(new message("user1", "alo trang ne", R.drawable.baseline_account_circle_24));
        messageList.add(new message("user2", "hello", R.drawable.baseline_filter_alt_24));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new messageAdapter(getApplicationContext(),messageList));

        addControlls();
        addEvents();
    }

    private void addEvents() {
        btn_Quaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(community_chat.this, home1.class);
                startActivity(back);
            }
        });
    }

    private void addControlls() {
        edtChat = findViewById(R.id.edtChat);
        btn_Picture = findViewById(R.id.btn_Picture);
        btn_Quaylai = findViewById(R.id.btn_Quaylai);
        btn_Send = findViewById(R.id.btn_Send);
    }
}
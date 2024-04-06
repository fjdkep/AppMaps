package com.example.cafe4u.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cafe4u.R;

import java.util.List;

public class messageAdapter extends RecyclerView.Adapter<messageViewHolder> {

    Context context;
    List<message> messageList;

    public messageAdapter(Context context, List<message> messageList) {
        this.context = context;
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public messageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new messageViewHolder(LayoutInflater.from(context).inflate(R.layout.message_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull messageViewHolder holder, int position) {
        holder.nameView.setText(messageList.get(position).getUsername());
        holder.contentView.setText(messageList.get(position).getContext());
        holder.imageUserView.setImageResource(messageList.get(position).getImageUser());

    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }
}

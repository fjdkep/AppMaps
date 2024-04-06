package com.example.cafe4u.Message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cafe4u.R;

public class messageViewHolder extends RecyclerView.ViewHolder {
    ImageView imageUserView;
    TextView nameView, contentView;
    public messageViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUserView = itemView.findViewById(R.id.imgvUser);
        nameView = itemView.findViewById(R.id.txtvUser);
        contentView = itemView.findViewById(R.id.txtvContent);
    }


}

package com.example.cafe4u.SearchList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cafe4u.R;
import com.example.cafe4u.chitiet_quan;

import java.util.ArrayList;

public class QuanArrayAdapter extends RecyclerView.Adapter<QuanArrayAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageShop;
        private TextView mNameShop;
        private TextView mVoteShop;
        private TextView mDescribeShop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageShop = itemView.findViewById(R.id.imgShop);
            mNameShop = itemView.findViewById(R.id.nameShop);
            mVoteShop= itemView.findViewById(R.id.voteShop);
            mDescribeShop = itemView.findViewById(R.id.describeShop);
        }
    }
    private Context mContext;
    private ArrayList<QuanCafe> mList;

    public QuanArrayAdapter(Context mContext, ArrayList<QuanCafe> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View heroView = inflater.inflate(R.layout.layout_shop, parent, false);
        ViewHolder viewHolder = new ViewHolder(heroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        QuanCafe cafe = mList.get(position);
        holder.mImageShop.setImageResource(cafe.getImage());
        holder.mNameShop.setText(cafe.getName());
        holder.mVoteShop.setText(String.valueOf(cafe.getVote()));
        holder.mDescribeShop.setText(cafe.getDescribe());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyen den gd chi tiet quan khi nhap vao muc
                Intent intent = new Intent(mContext, chitiet_quan.class);
                intent.putExtra("cafeImage","0");
                intent.putExtra("cafeName",cafe.getName());
                intent.putExtra("cafeVote",cafe.getVote());
                intent.putExtra("cafeDescribe",cafe.getDescribe());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

}

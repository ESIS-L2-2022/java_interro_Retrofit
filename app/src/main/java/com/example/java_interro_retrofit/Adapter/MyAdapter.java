package com.example.java_interro_retrofit.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.java_interro_retrofit.R;
import com.example.java_interro_retrofit.data.model.Items;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Items> mData = new ArrayList<>();

    public MyAdapter() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id_name.setText(mData.get(position).getId() + "");
        holder.login.setText(mData.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
         return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id_name;
        TextView login;

        ViewHolder(View itemView) {
            super(itemView);
            id_name = itemView.findViewById(R.id.id);
            login = itemView.findViewById(R.id.login);
        }
    }

    public void setData(List<Items> newdata){
        mData = newdata;
        notifyDataSetChanged();
    }
}

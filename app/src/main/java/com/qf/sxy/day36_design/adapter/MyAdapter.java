package com.qf.sxy.day36_design.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qf.sxy.day36_design.R;

import java.util.List;

/**
 * Created by sxy on 2016/11/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<String> list;
    public MyAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvShow.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvShow;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvShow = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}

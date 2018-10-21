package com.example.vikas.recycledemo1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyHolder> {
    Context ct;
    ArrayList<Person> al;
    MyAdaptor(Context ct, ArrayList<Person> al){
        this.ct=ct;
        this.al=al;

    }
    public  class MyHolder extends RecyclerView.ViewHolder{
    TextView tv1,tv2;
    ImageView iv;
        public MyHolder(View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
            iv=itemView.findViewById(R.id.iv);
        }
    }
    @Override
    public MyAdaptor.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li=LayoutInflater.from(ct);


        View v=li.inflate(R.layout.mylayout,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdaptor.MyHolder holder, int position) {
        Person p1=al.get(position);
        holder.tv1.setText(p1.getName());
        holder.tv2.setText(p1.getDesc());
        holder.iv.setImageResource(p1.getImage());
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

}

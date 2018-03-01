package com.example.admin.collegemanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 1/14/2018.
 */
public class MyAdapter2 extends BaseAdapter {

    List<StudentDetail> ldata;
    int rlayout;
    Context c;

    public MyAdapter2(List<StudentDetail> ldata, int rlayout, Context c) {
        this.ldata = ldata;
        this.rlayout = rlayout;
        this.c = c;
    }

    @Override
    public int getCount() {
        return ldata.size();
    }

    @Override
    public Object getItem(int position) {
        return ldata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(c).inflate(rlayout,null);
        TextView t1=(TextView)convertView.findViewById(R.id.t1);
        TextView t2=(TextView)convertView.findViewById(R.id.t2);
        TextView t3=(TextView)convertView.findViewById(R.id.t3);
        TextView t4=(TextView)convertView.findViewById(R.id.t4);
        TextView t5=(TextView)convertView.findViewById(R.id.t5);
        TextView t6=(TextView)convertView.findViewById(R.id.t6);

        t1.setText(String.valueOf(ldata.get(position).getRno()));
        t2.setText(ldata.get(position).getFname());
        t3.setText(ldata.get(position).getLname());
        t4.setText(ldata.get(position).getEmail());
        t5.setText(ldata.get(position).getContact());
        t6.setText(ldata.get(position).getAddress());

        return convertView;
    }
}

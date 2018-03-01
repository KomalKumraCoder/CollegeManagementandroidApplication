package com.example.admin.collegemanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 1/13/2018.
 */
public class MyAdapter extends BaseAdapter {
    List<CourseDetail>ldata;
    int rlayout;
    Context c;

    public MyAdapter(List<CourseDetail> ldata, int rlayout, Context c) {
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
        convertView = LayoutInflater.from(c).inflate(rlayout,null);
        TextView t1=(TextView)convertView.findViewById(R.id.t1);
        TextView t2=(TextView)convertView.findViewById(R.id.t2);
        TextView t3=(TextView)convertView.findViewById(R.id.t3);
        TextView t4=(TextView)convertView.findViewById(R.id.t4);

        t1.setText(String.valueOf(ldata.get(position).getId()));
        t2.setText(ldata.get(position).getCname());
        t3.setText(ldata.get(position).getDuration());
        t4.setText(ldata.get(position).getFees());

        return convertView;
    }
}

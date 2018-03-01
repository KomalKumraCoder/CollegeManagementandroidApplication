package com.example.admin.collegemanagementsystem.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.collegemanagementsystem.CourseDetail;

import java.util.ArrayList;

/**
 * Created by Admin on 1/13/2018.
 */
public class DbController implements Dbconstant {
    DbHelper helper;
    SQLiteDatabase db;
    public DbController(Context c){
        helper=new DbHelper(c,dbName,null,version);
    }
    public void open(){
        db=helper.getWritableDatabase();
    }
    public void close(){
        db.close();
    }
    public long insertdata(String id,String cname,String duration,String fees){
        open();
        ContentValues obj=new ContentValues();
        obj.put(c1,id);
        obj.put(c2,cname);
        obj.put(c3,duration);
        obj.put(c4,fees);
        long r=db.insert(tbName,null,obj);
        return r;
    }
    public ArrayList<CourseDetail> getData(){
        String q="select * from "+tbName+";";
        open();
        ArrayList<CourseDetail> cdlist=new ArrayList<CourseDetail>();
        Cursor c=db.rawQuery(q,null);
        if (c.moveToFirst()){
            do{
               CourseDetail cd=new CourseDetail();
                cd.setId(c.getString(0));
                cd.setCname(c.getString(1));
                cd.setDuration(c.getString(2));
                cd.setFees(c.getString(3));
                cdlist.add(cd);
            }while (c.moveToNext());
        }
        close();
        return cdlist;
    }




}

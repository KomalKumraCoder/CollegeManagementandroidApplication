package com.example.admin.collegemanagementsystem.Database2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.collegemanagementsystem.CourseDetail;
import com.example.admin.collegemanagementsystem.StudentDetail;

import java.util.ArrayList;

/**
 * Created by Admin on 1/13/2018.
 */
public class DbController2 implements DbConstantStudent {
    DbHelper2 helper;
    SQLiteDatabase db;
    public DbController2(Context c){
        helper=new DbHelper2(c,dbName,null,version);
    }
    public void open(){
        db=helper.getWritableDatabase();
    }
    public void close(){
        db.close();
    }
    public long insertdata(String rno,String fname,String lname,String email,String contact,String address){
        open();
        ContentValues obj=new ContentValues();
        obj.put(c1,rno);
        obj.put(c2,fname);
        obj.put(c3,lname);
        obj.put(c4,email);
        obj.put(c5,contact);
        obj.put(c6,address);
        long r=db.insert(tbName,null,obj);
        return r;
    }
    public ArrayList<StudentDetail> getData(){
        String q="select * from "+tbName+";";
        open();
        ArrayList<StudentDetail> cdlist=new ArrayList<StudentDetail>();
        Cursor c=db.rawQuery(q,null);
        if (c.moveToFirst()){
            do{
                StudentDetail sd=new StudentDetail();
               sd.setRno(c.getString(0));
                sd.setFname(c.getString(1));
                sd.setLname(c.getString(2));
                sd.setEmail(c.getString(3));
                sd.setContact(c.getString(4));
                sd.setAddress(c.getString(5));
                cdlist.add(sd);
            }while (c.moveToNext());
        }
        close();
        return cdlist;
    }


}

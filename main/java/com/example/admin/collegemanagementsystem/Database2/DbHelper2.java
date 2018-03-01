package com.example.admin.collegemanagementsystem.Database2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 1/13/2018.
 */
public class DbHelper2 extends SQLiteOpenHelper implements DbConstantStudent {
    public DbHelper2(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(tcreate);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL(tcreate);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

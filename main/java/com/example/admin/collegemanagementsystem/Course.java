package com.example.admin.collegemanagementsystem;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.collegemanagementsystem.Database.DbController;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_course, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void test(View v){
        DbController obj=new DbController(this);
        EditText e1=(EditText)findViewById(R.id.e1);
        EditText e2=(EditText)findViewById(R.id.e2);
        EditText e3=(EditText)findViewById(R.id.e3);
        EditText e4=(EditText)findViewById(R.id.e4);
        String id,cname,duration,fees;
        id=e1.getText().toString();
        cname=e2.getText().toString();
        duration=e3.getText().toString();
        fees=e4.getText().toString();
        long x=obj.insertdata(id,cname,duration,fees);
        if(x==-1){
            Toast.makeText(getApplicationContext(),"Problem in Insertion",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Insertion Done Successfully",Toast.LENGTH_LONG).show();
        }
    }
}

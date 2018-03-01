package com.example.admin.collegemanagementsystem;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.collegemanagementsystem.Database2.DbController2;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student, menu);
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
        DbController2 obj=new DbController2(this);
        EditText e1=(EditText)findViewById(R.id.e1);
        EditText e2=(EditText)findViewById(R.id.e2);
        EditText e3=(EditText)findViewById(R.id.e3);
        EditText e4=(EditText)findViewById(R.id.e4);
        EditText e5=(EditText)findViewById(R.id.e5);
        EditText e6=(EditText)findViewById(R.id.e6);

        String Rno,Fname,Lname,Email,Contact,Address;
        Rno=e1.getText().toString();
        Fname=e2.getText().toString();
        Lname=e3.getText().toString();
        Email=e4.getText().toString();
        Contact=e5.getText().toString();
        Address=e6.getText().toString();

        long x=obj.insertdata(Rno,Fname,Lname,Email,Contact,Address);
        if(x==-1){
            Toast.makeText(getApplicationContext(), "Problem in Insertion", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Insertion Done Successfully",Toast.LENGTH_LONG).show();
        }
    }
}

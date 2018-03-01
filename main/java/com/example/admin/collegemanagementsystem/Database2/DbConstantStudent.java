package com.example.admin.collegemanagementsystem.Database2;

/**
 * Created by Admin on 1/13/2018.
 */
public interface DbConstantStudent {
    String c1="Rno";
    String c2="Fname";
    String c3="Lname";
    String c4="Email";
    String c5="Contact";
    String c6="Address";

    String tbName="tbStudent";
    String dbName="dbcollege";
    int version=2;
    String tcreate="Create table "+tbName+"("+c1+" varchar(50) Primary Key,"+c2+" varchar(50),"+c3+" varchar(50),"+c4+" varchar(50),"+c5+" varchar(100),"+c6+" varchar(100))";
}

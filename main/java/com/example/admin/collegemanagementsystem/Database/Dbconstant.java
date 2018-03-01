package com.example.admin.collegemanagementsystem.Database;

/**
 * Created by Admin on 1/13/2018.
 */
public interface Dbconstant {
    String c1="id";
    String c2="cname";
    String c3="durstion";
    String c4="fees";
    String tbName="tbcourse";
    String dbName="dbcollege";
    int version=1;
    String tcreate="Create table "+tbName+"("+c1+" varchar(50) Primary Key,"+c2+" varchar(50),"+c3+" varchar(50),"+c4+" varchar(50))";


}

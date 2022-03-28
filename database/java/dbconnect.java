package com.example.student_database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbconnect extends SQLiteOpenHelper {
    private static final String dbname="AndroidMCA";
    public dbconnect(@Nullable Context context) {
        super(context,dbname,null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String q="create table student(sid integer primary key,sname text,course text)";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean Insert(String n1, String s1, String s2)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("sid",n1);
        cv.put("sname",s1);
        cv.put("course",s2);
        long b=db.insert("student",null,cv);
        if(b==-1)return false;
        else
            return true;

    }
    public Cursor Select()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cr=db.rawQuery("select * from student",null);
        return cr;
    }
    public boolean delete(int n1)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from student where sid=?",new String[]{String.valueOf(n1)});
        if(c.getCount()>0) {
            long b = db.delete("student", "sid=?", new String[]{String.valueOf(n1)});
            if (b == -1) return false;
            else
                return true;
        }
        else
            return false;
    }
    public boolean Update(String n1, String s1, String s2)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("sname",s1);
        cv.put("course",s2);
        Cursor c=db.rawQuery("select * from student where sid=?",new String[]{n1});
        if(c.getCount()>0)
        {
            long up=db.update("student",cv,"sid=?",new String[]{n1});
            if(up==-1) return false;
            else
                return true;
        }
        else
            return false;

    }

}
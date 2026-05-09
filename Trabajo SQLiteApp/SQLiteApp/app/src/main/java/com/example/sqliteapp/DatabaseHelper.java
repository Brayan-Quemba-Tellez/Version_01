package com.example.sqliteapp;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "empresa.db";

    private static final int DATABASE_VERSION = 2;

    public  DatabaseHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE usuarios("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT," +
                "correo TEXT," +
                "telefono TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        onCreate(db);
    }
}
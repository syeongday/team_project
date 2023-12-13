package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyboxActivity extends Activity {

    dbHelper mydbhelper;
    EditText editName, edit, editRes1, editRes2;
    Button initB, insB, SearchB, first;
    SQLiteDatabase mysqlDB;
    TextView my_box, keword, tour;


    public class dbHelper extends SQLiteOpenHelper {
        public dbHelper(Context context){
            super(context, "telDB",null,1);
        }
        @Override
        public void onCreate(SQLiteDatabase db){
            db.execSQL("CREATE TABLE contacts( gName CHAR(20) PRIMARY KEY, g CHAR(20));");

        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            db.execSQL("DROP TABLE IF EXISTS contacts");
            onCreate(db);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybox);

        setTitle("데이터 베이스 실습");
        editName = (EditText) findViewById(R.id.editTextTextPersonName);
        edit = (EditText) findViewById(R.id.editTextTextMultiLine2);
        editRes1 = (EditText) findViewById(R.id.editTextTextMultiLine);
        editRes2 = (EditText) findViewById(R.id.editTextTextMultiLine2);
        initB = (Button) findViewById(R.id.button10);
        insB = (Button) findViewById(R.id.button11);
        SearchB = (Button) findViewById(R.id.button12);
        my_box = (TextView)findViewById(R.id.textView11);
        keword = (TextView)findViewById(R.id.textView);
        tour = (TextView)findViewById(R.id.textView10);
        first = (Button)findViewById(R.id.button13);

        mydbhelper = new dbHelper(this);
        initB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mysqlDB = mydbhelper.getWritableDatabase();
                mydbhelper.onUpgrade(mysqlDB,1,2);
                mysqlDB.close();
            }
        });

        insB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mysqlDB = mydbhelper.getWritableDatabase();
                mysqlDB.execSQL("INSERT INTO contacts VALUES ('" + editName.getText().toString() + "','" +edit.getText().toString()+"');");
                mysqlDB.close();

            }
        });

        SearchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mysqlDB = mydbhelper.getReadableDatabase();
                Cursor cursor;
                cursor = mysqlDB.rawQuery("SELECT * FROM contacts;",null);
                String strname = "키워드 \r\n" + "==========" + "\r\n";
                String str = "관광지" + "\r\n" + "==========" + "\r\n";
                while(cursor.moveToNext()){
                    strname += cursor.getString(0)+"\r\n";
                    str += cursor.getString(1) + "\r\n";
                }
                editRes1.setText(strname);
                editRes2.setText(str);
                cursor.close();
                mysqlDB.close();
            }
        });


        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        editName.setTypeface(typeface);
        edit.setTypeface(typeface);
        editRes1.setTypeface(typeface);
        editRes2.setTypeface(typeface);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "mongmyfont.ttf");
        initB.setTypeface(typeface1);
        insB.setTypeface(typeface1);
        SearchB.setTypeface((typeface1));
        keword.setTypeface(typeface1);
        tour.setTypeface(typeface1);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(firstintent);
            }
        });

    }
}
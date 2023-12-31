package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView menu;

    CheckBox checkBox;
    Button start_button, button;
    Button star;
    Dialog dialog;
    RatingBar ratingBar;
    String str;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (TextView) findViewById(R.id.menu);
        registerForContextMenu(menu);

        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        start_button = (Button) findViewById(R.id.button3);
        star = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iintent = new Intent(getApplicationContext(),MyboxActivity.class);
                startActivity(iintent);
            }
        });



        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dialog = new Dialog(MainActivity.this);
               dialog.setContentView(R.layout.dialog);
               ratingBar = (RatingBar) dialog.findViewById(R.id.ratingBar);
               button = (Button) dialog.findViewById(R.id.button11);

               button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Toast.makeText(getApplicationContext(),str+"점 입니다.\n좋은 의견 내주셔서 감사합니다 :-)",Toast.LENGTH_SHORT).show();
                       dialog.dismiss();
                   }
               });
               ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                   @Override
                   public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                       str = String.valueOf(v);
                   }
               });
               dialog.show();
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        // 더 추가할 수도 있으니까 switch 문으로 ...
        switch (item.getItemId()) {
            case R.id.exit:
                finishAffinity();
                System.runFinalization();
                System.exit(0); // 모든 액티비티 종료 (앱 종료)
        }
        return super.onContextItemSelected(item);
    }
}
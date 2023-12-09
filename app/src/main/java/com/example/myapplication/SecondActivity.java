package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;



public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        ImageButton imageButton1;
        ImageButton imageButton2;
        ImageButton imageButton3;
        ImageButton imageButton4;
        ImageButton imageButton5;
        ImageButton imageButton6;
        TextView textView;
        ImageButton airplane;
        ProgressBar seekbar1;

        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton)findViewById(R.id.imageButton6);
        textView = (TextView)findViewById(R.id.textView);
        airplane = (ImageButton)findViewById(R.id.imageButton7) ;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        seekbar1 = (SeekBar) findViewById(R.id.seekBar1);


        seekbar1.setProgress(25);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"mongmyfont.ttf");
        textView.setTypeface(typeface);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("남아메리카");
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("아프리카");
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("오세아니아");
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("아시아");
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("유럽");
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("북아메리카");
            }
        });

        Intent Inintent = new Intent(getApplicationContext(),ThirdActivity.class);

        airplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Inintent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton:
                        Inintent.putExtra("nara","northamerica");
                        break;
                    case R.id.radioButton2:
                        Inintent.putExtra("nara","southamerica");
                        break;
                    case R.id.radioButton3:
                        Inintent.putExtra("nara","africa");
                        break;
                    case R.id.radioButton4:
                        Inintent.putExtra("nara","eu");
                        break;
                    case R.id.radioButton5:
                        Inintent.putExtra("nara","asia");
                        break;
                    case R.id.radioButton6:
                        Inintent.putExtra("nara","os");
                        break;
                }
            }
        });


    }
}

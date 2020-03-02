package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Language extends AppCompatActivity {

    private RadioButton radioButton1,radioButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        radioButton1 =(RadioButton) findViewById(R.id.radioButtonb);
        radioButton2 =(RadioButton) findViewById(R.id.radioButtone);

        Typeface mycustomfont =Typeface.createFromAsset(getAssets(),"fonts/solaimanlipinormal.ttf");
        radioButton1.setTypeface(mycustomfont);


















    }
}

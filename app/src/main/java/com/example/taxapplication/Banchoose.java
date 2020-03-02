package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Banchoose extends AppCompatActivity {
    private RadioButton radioButton1,radioButton2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banchoose);
        radioButton1 =(RadioButton) findViewById(R.id.radioBtnbp);
        radioButton2=(RadioButton)findViewById(R.id.radioBtnbm);

        Typeface mycustomfont =Typeface.createFromAsset(getAssets(),"fonts/solaimanlipinormal.ttf");
        radioButton1.setTypeface(mycustomfont);

        Typeface mycustomfont =Typeface.createFromAsset(getAssets(),"fonts/solaimanlipinormal.ttf");
        radioButton2.setTypeface(mycustomfont);
    }
}

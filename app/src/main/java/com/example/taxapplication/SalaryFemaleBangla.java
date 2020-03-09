package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SalaryFemaleBangla extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary_female_bangla);
        textView1 = (TextView) findViewById(R.id.basicbfid);
        textView2 = (TextView) findViewById(R.id.houserentbfid);
        textView3 = (TextView) findViewById(R.id.conveyancebfid);
        textView4 = (TextView) findViewById(R.id.medicalalbfid);
        textView5 = (TextView) findViewById(R.id.leavebfid);
        textView6 = (TextView) findViewById(R.id.providentid);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView1.setTypeface(mycustomfont1);

        Typeface mycustomfont2 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView2.setTypeface(mycustomfont2);
        Typeface mycustomfont3 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView3.setTypeface(mycustomfont3);

        Typeface mycustomfont4 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView4.setTypeface(mycustomfont4);
        Typeface mycustomfont5 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView5.setTypeface(mycustomfont5);

        Typeface mycustomfont6 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        textView6.setTypeface(mycustomfont6);

    }
}

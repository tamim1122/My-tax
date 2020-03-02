package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Banchoose extends AppCompatActivity {
    private Button button, button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        button1 = (Button) findViewById(R.id.bcp);
        button2 = (Button) findViewById(R.id.bcm);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        button1.setTypeface(mycustomfont1);

        Typeface mycustomfont2 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        button2.setTypeface(mycustomfont2);

        Button button1 = (Button) findViewById(R.id.bcp);
        Button button2 = (Button) findViewById(R.id.bcm);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Banchoose.this, SalaryMaleBangla.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Banchoose.this, SalaryFemaleBangla.class);
                startActivity(intent);
            }
        });


    }
}

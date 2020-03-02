package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLanguage extends AppCompatActivity {

    private Button button,button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        button1 =(Button) findViewById(R.id.clb);
        button2 =(Button) findViewById(R.id.cle);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"fonts/solaimanlipinormal.ttf");
        button1.setTypeface(mycustomfont);

        Button button1=(Button)findViewById(R.id.clb);
        Button button2=(Button)findViewById(R.id.clb);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseLanguage.this,Banchoose.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseLanguage.this,ChooseOption.class);
                startActivity(intent);
            }
        });



    }





    }


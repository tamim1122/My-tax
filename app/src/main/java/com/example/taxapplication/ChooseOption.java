package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ChooseOption extends AppCompatActivity {
    RadioGroup radioGroup;
            RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_option);
        radioButton  =findViewById(R.id.radioButton12);
        radioButton =findViewById(R.id.radioButton13);
    }
}

package com.example.lesson_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivityRelative extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_relative);
        textView = findViewById(R.id.text4);
        textView.animate().scaleX(2f).scaleY(2f).setDuration(6000);
    }
}
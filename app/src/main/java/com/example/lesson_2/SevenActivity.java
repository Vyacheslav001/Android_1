package com.example.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
//        Log.d(SevenActivity.class.getName(), "Картинка получена");
//        Log.d(SevenActivity.class.getName(), getIntent().getStringExtra("CITY"));

        TextView city_name = findViewById(R.id.text_city_name);
        Bundle argument = getIntent().getExtras();
        if (argument != null) {
            String name = argument.getString("CITY");
            if (name.equalsIgnoreCase("Moscow")) {
                city_name.setText("CITY: " + name);
            } else {
                city_name.setText("По такому городу нет информации");
            }
        }

        findViewById(R.id.button_seven).setOnClickListener(ign -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}

//1:58
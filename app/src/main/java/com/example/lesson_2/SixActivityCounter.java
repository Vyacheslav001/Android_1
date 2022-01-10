package com.example.lesson_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SixActivityCounter extends AppCompatActivity {
    private static final String INCREMENT_VALUE = "VALUE"; //Добавляем константу через Ctrl+Alt+C
    private TextView textViewCount;
    //Метод запоминания переменной №3 (53:00)
    //через статичную переменную, засоряет память
//    public static Incrementer incrementer = new Incrementer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_counter);

    //Метод запоминания переменной №1
    //        incrementer = new Incrementer(savedInstanceState == null ? 0 : savedInstanceState.getInt(INCREMENT_VALUE, 0));
    //Метод запоминания переменной №2
    //        incrementer = ((PogodaApplication) getApplication()).getIncrementer();

        textViewCount = findViewById(R.id.counter);
        textViewCount.setText(String.valueOf(Incr.getInstance().getValue()));
    //Делаем счетчик
        findViewById(R.id.button_counter).setOnClickListener(ign -> { //ign для понимания, что данная переменная нигде не используется
            Incr.getInstance().increment();
            textViewCount.setText(String.valueOf(Incr.getInstance().getValue()));
        });
    }

    //Позволяет контролировать состояния Активити
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        outState.putInt(INCREMENT_VALUE, incrementer.getValue());
//        super.onSaveInstanceState(outState);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

//53:00
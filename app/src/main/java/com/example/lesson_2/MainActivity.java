package com.example.lesson_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String RESURRECTION_KEY = "Resurrection key";
    final String TAG = "ACTIVITY_STATE";

    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            intent.putExtra(RESURRECTION_KEY, "Hello from Activity 1");
            startActivity(intent);
        }
    };

    private View.OnClickListener listener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TherdActivityLinear.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, FourthActivityRelative.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, FiveActivityLinear2.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(new MyView(this));
        System.currentTimeMillis();
//        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
//        resurrect(savedInstanceState);
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(listener);
//        или лучше написать так:
        findViewById(R.id.button2).setOnClickListener(listener2);
        findViewById(R.id.button3).setOnClickListener(listener3);
        findViewById(R.id.button4).setOnClickListener(listener4);
        findViewById(R.id.button5).setOnClickListener(listener5);
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToast("onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    private void resurrect(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            makeToast("onCreate");
        } else {
            String s = savedInstanceState.getString(RESURRECTION_KEY);
            if (s == null) {
                makeToast("onRestoreInstanceState");
            } else {
                makeToast(s);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(RESURRECTION_KEY, "Hello after resurrection");
        makeToast("onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("onDestroy");
    }

    private void makeToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d(TAG, text);
    }
}
package com.example.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TherdActivityLinear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therd_linear);
        View.OnClickListener listener1 = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TherdActivityLinear.this, MainActivity.class);
                startActivity(intent);
            }
        };

        findViewById(R.id.button_31).setOnClickListener(listener1);
    }
}
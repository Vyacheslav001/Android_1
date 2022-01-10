package com.example.lesson_2;

import android.app.Application;

public class PogodaApplication extends Application {
    private Incrementer incrementer;

    @Override
    public void onCreate() {
        super.onCreate();
        incrementer = new Incrementer(0);
    }

    public Incrementer getIncrementer() {
        return incrementer;
    }
}

package com.example.lesson_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    Paint paint = new Paint();
    Rect rect = new Rect(0, 0, 0, 0);

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        paint.setColor(Color.GREEN);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rect = new Rect(w / 4, h / 4, w / 2, h / 2);
    }

    @Override
    protected void onDraw(Canvas canvas) { //Canvas это аналог Paint
        super.onDraw(canvas);
        init();
        canvas.drawRect(new Rect(rect), paint);
        canvas.drawText("Hello world!", 100,100, new Paint());
    }
}

//34:54

package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    Paint one = new Paint();
    Paint two = new Paint();
    Paint three = new Paint();
    Paint four = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init() {
        one.setColor(Color.BLACK);
        one.setAntiAlias(true);
        one.setStyle(Paint.Style.FILL);

        two.setColor(Color.BLACK);
        two.setStrokeWidth(5);
        two.setStyle(Paint.Style.STROKE);

        three.setColor(Color.BLUE);
        three.setStyle(Paint.Style.FILL);

        four.setColor(Color.BLACK);
        four.setStyle(Paint.Style.STROKE);
        four.setStrokeWidth(30);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆


        canvas.drawCircle(100, 100, 80, one);
        canvas.drawCircle(400, 100, 80, two);
        canvas.drawCircle(100, 400, 80, three);
        canvas.drawCircle(400, 400, 100, four);
    }
}

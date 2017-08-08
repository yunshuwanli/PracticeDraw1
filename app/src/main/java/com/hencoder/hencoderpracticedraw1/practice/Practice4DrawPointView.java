package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice4DrawPointView extends View {

    int i;

    Paint p = new Paint();
    Paint p2 = new Paint();

    public Practice4DrawPointView(Context context) {
        super(context);init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);init();
    }

    void init(){
        p.setStrokeCap(Paint.Cap.ROUND);
        p.setStrokeWidth(100);
        p.setColor(Color.BLACK);

        p2.setStrokeCap(Paint.Cap.SQUARE);
        p2.setStrokeWidth(100);
        p2.setColor(Color.BLACK);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        Log.e("tag", "TAG : " + i);

        canvas.drawPoint(500, 400, p);
        canvas.drawPoint(1000, 400, p2);
    }
}

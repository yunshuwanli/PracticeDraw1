package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawArc(new RectF(300, 100, 1000, 800), -180, 120, true, paint);

        RectF f2 = new RectF(320, 120, 1020, 820);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(f2,-60,55,true,paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawArc(f2,-13,15,true,paint);
        paint.setColor(Color.DKGRAY);
        canvas.drawArc(f2,4,8,true,paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(f2,14,44,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(f2,60,120,true,paint);

    }
}

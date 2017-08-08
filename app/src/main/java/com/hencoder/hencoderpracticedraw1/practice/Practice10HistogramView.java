package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();

    Paint paint2 = new Paint();
    Path path2 = new Path();

    Paint paint3 = new Paint();
    Path path3 = new Path();

    {
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(200, 100);
        path.lineTo(200, 700);
        path.lineTo(1220, 700);

        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.GREEN);
        RectF rf = new RectF(240, 688, 340, 700);
        RectF rf2 = new RectF(380, 640, 480, 700);
        RectF rf3 = new RectF(520, 640, 620, 700);
        RectF rf4 = new RectF(660, 400, 760, 700);
        RectF rf5 = new RectF(800, 300, 900, 700);
        RectF rf6 = new RectF(940, 200, 1040, 700);
        RectF rf7 = new RectF(1080, 600, 1180, 700);
        path2.addRect(rf, Path.Direction.CCW);
        path2.addRect(rf2, Path.Direction.CCW);
        path2.addRect(rf3, Path.Direction.CCW);
        path2.addRect(rf4, Path.Direction.CCW);
        path2.addRect(rf5, Path.Direction.CCW);
        path2.addRect(rf6, Path.Direction.CCW);
        path2.addRect(rf7, Path.Direction.CCW);

        paint3.setColor(Color.WHITE);
        paint3.setTextSize(36);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawPath(path, paint);
        canvas.drawPath(path2, paint2);
        canvas.drawText("A", 260, 760, paint3);
        canvas.drawText("BC", 400, 760, paint3);
        canvas.drawText("DEF", 540, 760, paint3);
        canvas.drawText("JKL", 680, 760, paint3);
        canvas.drawText("JKL", 820, 760, paint3);
        canvas.drawText("中国", 960, 760, paint3);
        canvas.drawText("Jiap", 1120, 760, paint3);
    }
}

package com.example.test_androiddemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MeZi extends View {

//    定义变量X，Y坐标
    public  float bitmapX;
    public  float bitmapY;

    public MeZi(Context context) {
        super(context);
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected  void  onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.pic);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if (bitmap.isRecycled()){
            bitmap.recycle();
        }

    }

    public MeZi(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MeZi(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}

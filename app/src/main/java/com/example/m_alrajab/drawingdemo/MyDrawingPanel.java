package com.example.m_alrajab.drawingdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by m_alrajab on 4/14/16.
 */
public class MyDrawingPanel extends View {
    Paint paint =new Paint();
    final int BARW=50;
    final int BARSPACE=20;

    public MyDrawingPanel(Context c, AttributeSet a){
        super(c,a);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLUE);
        canvas.drawARGB(255,255,255,0);

        canvas.drawLine(5,5*canvas.getHeight()/6, canvas.getWidth()-5,5*canvas.getHeight()/6, paint );
        canvas.drawLine(canvas.getWidth()/6,5, canvas.getWidth()/6,canvas.getHeight()-5, paint );

        paint.setColor(Color.RED); // draw As%
        canvas.drawRect(canvas.getWidth()/6, canvas.getHeight()* ((5/6f)-SharedVals.perA),canvas.getWidth()/6+BARW,5*canvas.getHeight()/6  ,paint);
         paint.setTextSize(35);
        canvas.drawText("A%",canvas.getWidth()/6+4,5*canvas.getHeight()/6 +40,paint);
        paint.setColor(Color.BLUE);
        canvas.drawText("B%",canvas.getWidth()/6+80,5*canvas.getHeight()/6 +40,paint);

        canvas.drawRect(canvas.getWidth()/6 + (BARW+BARSPACE), canvas.getHeight()* ((5/6f)-SharedVals.perB),canvas.getWidth()/6+BARW+(BARW+BARSPACE),5*canvas.getHeight()/6  ,paint);
        paint.setColor(Color.BLACK);
        canvas.drawText("C%",canvas.getWidth()/6+150,5*canvas.getHeight()/6 +40,paint);
        canvas.drawRect(canvas.getWidth()/6+ 2*(BARW+BARSPACE), canvas.getHeight()* ((5/6f)-SharedVals.perC),canvas.getWidth()/6+BARW+ 2*(BARW+BARSPACE),5*canvas.getHeight()/6  ,paint);
        paint.setColor(Color.GREEN);
        canvas.drawText("D%",canvas.getWidth()/6+210,5*canvas.getHeight()/6 +40,paint);
        canvas.drawRect(canvas.getWidth()/6+ 3*(BARW+BARSPACE), canvas.getHeight()* ((5/6f)-SharedVals.perD),canvas.getWidth()/6+BARW+ 3*(BARW+BARSPACE),5*canvas.getHeight()/6  ,paint);
        paint.setColor(Color.WHITE);
        canvas.drawRect(canvas.getWidth()/6+ 4*(BARW+BARSPACE), canvas.getHeight()* ((5/6f)-SharedVals.perF),canvas.getWidth()/6+BARW+ 4*(BARW+BARSPACE),5*canvas.getHeight()/6  ,paint);


        invalidate();
    }
}

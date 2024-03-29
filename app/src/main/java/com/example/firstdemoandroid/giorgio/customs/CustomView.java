package com.example.firstdemoandroid.giorgio.customs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.example.firstdemoandroid.giorgio.graph.stuffs.Nodo;

public class CustomView extends View {

    private Paint interno;
    private Paint esterno;
    private Nodo nodo;

    public CustomView(Context context, Nodo nodo) {
        super(context);
        this.nodo = nodo;
        this.interno = new Paint();
        this.esterno = new Paint();
        interno.setColor(Color.RED);
        esterno.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(nodo.getX(), nodo.getY(), 20, esterno);
        canvas.drawCircle(nodo.getX(), nodo.getY(), 15, interno);
    }

    public Nodo getNodo() {
        return nodo;
    }
    public void changeColor(){
        interno.setColor(Color.GREEN);
    }
}
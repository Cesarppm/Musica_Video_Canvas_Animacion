package com.example.unidad2tarea2;



import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;


public class CanvasView extends View{
    private ShapeDrawable miDibujo; // Dibujo
    public CanvasView (Context context) {
        super(context);
        miDibujo = new ShapeDrawable();
    }


    @Override
    protected void onDraw(Canvas lienzo) {
        //Dibujar aquí
        // Se obtienen dimensiones de pantalla
        int resX=lienzo.getWidth(); // ancho en pixeles
        int resY=lienzo.getHeight(); // alto en pixeles

        // Crea un pincel
        Paint pincel = new Paint();

        // Rectangulo relleno
        pincel.setColor(Color.rgb(0,200,0)); // color RGB
        pincel.setStyle(Paint.Style.FILL);
        // lienzo.drawRect(resX/10,resY/10,resX*9/10,resY*9/10,pincel);
        lienzo.drawRect(resX/10,resY/12,resX*9/10,resY*14/18,pincel);

        pincel.setColor(Color.WHITE);
        pincel.setStrokeWidth(16);
        pincel.setStyle(Paint.Style.STROKE);
        //Porteria de arriba
        lienzo.drawRect(resX/2-100,100,resX/2+100,300,pincel);
        // Texto color naranja tamaño 75
        pincel.setColor(Color.rgb(255,153,34));
        pincel.setTextSize(75);
        //pincel.setTypeface(Typeface.SANS_SERIF);
        lienzo.drawText("MARCADOR 0-1",200,150,pincel);

        //Circulo central
        lienzo.drawCircle(resX/2,resY*5/11,100,pincel);

        //Circulo central
        lienzo.drawCircle(resX/2,resY*7/11,50,pincel);

        lienzo.drawCircle(resX/2,resY*7/30,50,pincel);

        lienzo.drawCircle(resX/2,resY*7/14,50,pincel);
        lienzo.drawCircle(resX/2,resY*7/17,50,pincel);

        //Porteria inferior
        lienzo.drawRect(resX/2-100,1500,resX/2+100,1700,pincel);
        // Texto color naranja tamaño 75
        pincel.setColor(Color.rgb(255,153,34));
        pincel.setTextSize(75);
        //pincel.setTypeface(Typeface.SANS_SERIF);
        lienzo.drawText("MARCADOR 1-0",resX/2,1700,pincel);

        //Contorno de la cancha
        lienzo.drawRect(resX/2-420,187,resX/2+420,1627,pincel);
        //Liena divisora
        lienzo.drawLine(0,resY*5/11,resX,resY*5/11,pincel);

        // Mostrar el dibujo en el lienzo
        miDibujo.draw(lienzo);
    }
}


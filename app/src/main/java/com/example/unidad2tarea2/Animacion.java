package com.example.unidad2tarea2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animacion extends Activity implements View.OnClickListener {
    Button btnIniciar,btnDetener;
    private ImageView ivAnimacion;
    private AnimationDrawable savingAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnIniciar = (Button)findViewById(R.id.btnArrancar);
        btnDetener = (Button)findViewById(R.id.btnParar);
        btnIniciar.setOnClickListener(this);
        btnDetener.setOnClickListener(this);
        ivAnimacion = (ImageView)findViewById(R.id.imCoraje);
        ivAnimacion.setBackgroundResource(R.drawable.animacion);
        savingAnimation = (AnimationDrawable)ivAnimacion.getBackground();
    }

    @Override
    public void onClick(View v) {
// TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.btnArrancar:
                savingAnimation.start();
                break;
            case R.id.btnParar:
                savingAnimation.stop();
                break;
        }
    }

}
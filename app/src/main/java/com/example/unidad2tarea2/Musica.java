package com.example.unidad2tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Musica extends AppCompatActivity {
    Button btnPlay, btnStop, btnExit;
    MediaPlayer mp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        btnExit = findViewById(R.id.btnExit);
        btnPlay.setEnabled(true);
        btnStop.setEnabled(false);
        btnExit.setEnabled(true);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPlay.setEnabled(false);
                btnStop.setEnabled(true);
                btnExit.setEnabled(false);
                mp = MediaPlayer.create(getApplicationContext(),R.raw.musicahd);
                mp.start();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPlay.setEnabled(true);
                btnStop.setEnabled(false);
                btnExit.setEnabled(true);
                mp.stop();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
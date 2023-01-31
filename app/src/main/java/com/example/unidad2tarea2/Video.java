package com.example.unidad2tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView vv;
    Button btnE, btn1,btn2;
    String loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        vv = findViewById(R.id.videoView);
        btnE = findViewById(R.id.btnEV);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        vv.setMediaController(new MediaController(this));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loc = "android.resource://"+getPackageName()+"/"+R.raw.patitojuan;
                vv.setVideoURI(Uri.parse(loc));
                vv.start();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loc = "android.resource://"+getPackageName()+"/"+R.raw.intro;
                vv.setVideoURI(Uri.parse(loc));
                vv.start();

            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
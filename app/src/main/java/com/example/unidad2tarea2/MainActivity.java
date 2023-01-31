package com.example.unidad2tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    String sistemas[]={"Reproductor Musical", "Reproductor de video", "Efectos Touch and Sonido", "Animacion", "Dibujo Canvas", "Gestures"};

    ArrayAdapter<String> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lista = findViewById(R.id.listView);

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sistemas);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, Musica.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, Video.class));
                } else if (position == 2) {
                    startActivity(new Intent(MainActivity.this, Touchandsonido.class));
                } else if (position == 3) {
                    startActivity(new Intent(MainActivity.this, Animacion.class));
                } else if (position == 4) {
                    startActivity(new Intent(MainActivity.this, Dibujo.class));
                } else if (position == 5) {

                } else {

                }


            }
        });


    }
}
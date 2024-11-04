package com.example.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button botonIr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonIr=findViewById(R.id.btn_ir);
        botonIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent abrirPantalla = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(abrirPantalla);


            }

        });
    }
}
package com.example.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button botonVolver;
TextView textop1;
    TextView textop2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Asociar los elementos de la interfaz con las variables Java
        botonVolver=findViewById(R.id.buttonVolver);
        textop1=findViewById(R.id.labelPantalla2);
        textop2=findViewById(R.id.labelApellido);
        Intent intent=getIntent();
        //Obten el intent y el valor de "palabra"
        String palabra=intent.getStringExtra("Palabra");
        //Configura el texto en el TextView
        textop2.setText(palabra);
         Intent nom=getIntent();
         String apell=Almacen.getApellido();
         textop1.setText(apell);

        botonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent volverPantalla=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(volverPantalla);
            }
        });

    }
}
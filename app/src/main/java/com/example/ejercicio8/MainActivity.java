package com.example.ejercicio8;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

Button botonIr;
EditText campoTexto;
EditText campoApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonIr=findViewById(R.id.btn_ir);
        campoTexto=findViewById(R.id.textoApellido);
        campoApellido=findViewById(R.id.textoNombre);
        botonIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Almacen.setApellido(campoApellido.getText().toString());
                String palabra=campoTexto.getText().toString();
                Intent abrirPantalla = new Intent(MainActivity.this, MainActivity2.class);
                abrirPantalla.putExtra("Palabra",palabra);

                startActivity(abrirPantalla);




            }

        });
    }
}
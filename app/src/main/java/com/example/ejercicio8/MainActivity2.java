package com.example.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {
Button botonVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botonVolver=findViewById(R.id.buttonVolver);

        botonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent volverPantalla=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(volverPantalla);
            }
        });

    }
}
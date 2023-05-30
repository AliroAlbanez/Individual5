package com.example.ingresodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nombre;
    TextView apellido;
    TextView correo;
    TextView clave;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent recibir=getIntent();
        nombre=(TextView) findViewById(R.id.tnombre);
        apellido=(TextView) findViewById(R.id.tapellido);
        correo=(TextView) findViewById(R.id.tcorreo);
        clave=(TextView) findViewById(R.id.tclave);

        nombre.setText("Nombre: "+recibir.getStringExtra("nombre"));
        apellido.setText("Apellido: "+recibir.getStringExtra("apellido"));
        correo.setText("Correo: "+recibir.getStringExtra("correo"));
        String con="";
        for(int i=0; i<recibir.getStringExtra("clave").length();i++){
            con=con+"*";
        }
        clave.setText("Contraseña: "+con);
    }
}
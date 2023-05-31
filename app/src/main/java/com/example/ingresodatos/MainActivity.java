package com.example.ingresodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Binder;

import com.example.ingresodatos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
EditText nombre;
EditText apellido;
EditText correo;
EditText clave;
Button boton;

private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        nombre=binding.textNombre;
        apellido=binding.textApellido;
        correo=binding.textCorreo;
        clave=binding.textClave;
        boton=binding.botonIngreso;

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variables para el mensaje toast a utilizar
                Context context =getApplicationContext();
                CharSequence text="Falta un dato. Debe completar todos los datos";
                int duracion = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duracion);

                String tnombre=nombre.getText().toString();
                String tapellido=apellido.getText().toString();
                String tcorreo=correo.getText().toString();
                String tclave=clave.getText().toString();

                if(tnombre.equals("") || tapellido.equals("") || tcorreo.equals("") || tclave.equals("")) {
                    toast.show();
                }else {
                    Intent llamar2 = new Intent(MainActivity.this, MainActivity2.class);
                    llamar2.putExtra("nombre", tnombre);
                    llamar2.putExtra("apellido", tapellido);
                    llamar2.putExtra("correo", tcorreo);
                    llamar2.putExtra("clave", tclave);
                    startActivity(llamar2);
                }
            }
        });
    }
}
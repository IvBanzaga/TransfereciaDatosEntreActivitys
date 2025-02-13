package com.vanzaga.transfereciadatosentreactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        tv1 = findViewById(R.id.textView_mostrarNombre);

        String dato_recibido = getIntent().getStringExtra("dato");
        String dato_edad = getIntent().getStringExtra("edad");

        // Calculamos el año de nacimiento
        int edad = Integer.parseInt(dato_edad);
        int fechaActual = Calendar.getInstance().get(Calendar.YEAR);
        int fechaNacimiento = (fechaActual -1) - edad;

        tv1.setText("Hola " + dato_recibido + " tienes " + dato_edad + " años" + "\n" + "en el año " + fechaNacimiento);
    }

    public void Anterior(View view) {
        // al pulsar el boton volvemos a la pantalla principal
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}


package com.vanzaga.transfereciadatosentreactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText, editTextEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.txt_nombre);
        editTextEdad = findViewById(R.id.txt_edad);
    }

    public void Siguiente(View view) {

        // Crear un Intent para iniciar la segunda actividad
        // vamos a enviar los datos del EditText a la segunda actividad

        Intent segundo = new Intent(this, MainActivity2.class);
        segundo.putExtra("dato", editText.getText().toString());
        segundo.putExtra("edad", editTextEdad.getText().toString());
        startActivity(segundo);
    }
}
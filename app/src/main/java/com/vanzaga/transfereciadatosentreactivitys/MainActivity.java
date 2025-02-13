package com.vanzaga.transfereciadatosentreactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.txt_nombre);
    }

    public void Siguiente(View view) {

        // Crear un Intent para iniciar la segunda actividad
        Intent segundo = new Intent(this, MainActivity2.class);
        segundo.putExtra("dato", editText.getText().toString());
        startActivity(segundo);
    }
}
package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrimeroActivityMoscoso extends AppCompatActivity {

    private TextView textoNombre;
    private TextView textoApellido;

    private TextView numeroUno;
    private TextView numeroDos;

    private TextView resultadoUno;
    private TextView resultadoDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeromoscoso_activity);

    }
}
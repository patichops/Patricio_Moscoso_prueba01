package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerceroActivityMoscoso extends AppCompatActivity {

    private TextView textoNombre;
    private TextView textoApellido;

    private EditText numeroUno;
    private EditText numeroDos;
    private Button cerrarButton;
    private ConstraintLayout layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceromoscoso_activity);

        layout3 = findViewById(R.id.layout3);
        textoNombre = findViewById(R.id.textViewNombre3);
        textoApellido = findViewById(R.id.textViewapellidos3);
        numeroDos = findViewById(R.id.editTextNumberDivisor3);
        numeroUno = findViewById(R.id.editTextNumberDividendo3);
        cerrarButton = findViewById(R.id.button_cerrar3);
    }
}
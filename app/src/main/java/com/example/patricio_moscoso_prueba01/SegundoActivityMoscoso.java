package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivityMoscoso extends AppCompatActivity {

    private EditText textoNombre;
    private EditText textoApellido;

    private TextView numeroUno;
    private TextView numeroDos;

    private Button siguienteButton;
    private Button cerrarButton;
    private ConstraintLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundomoscoso_activity);


        layout2 = findViewById(R.id.layout2);
        textoNombre = findViewById(R.id.editTextNombre2);
        textoApellido = findViewById(R.id.editTextApellidos2);
        numeroDos = findViewById(R.id.textViewdividendo2);
        numeroUno = findViewById(R.id.textViewdivisor2);
        siguienteButton = findViewById(R.id.button_siguienteLay2);
        cerrarButton = findViewById(R.id.button_cerrar2);


    }
}
package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivityMoscoso extends AppCompatActivity {

    private EditText textoNombre;
    private EditText textoApellido;

    private TextView numeroDivisor;
    private TextView numeroDividendo;
    private TextView numero;

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
        numeroDividendo = findViewById(R.id.textViewdividendo2);
        numeroDivisor = findViewById(R.id.textViewdivisor2);
        numero = findViewById(R.id.textViewNumero2);
        siguienteButton = findViewById(R.id.button_siguienteLay2);
        cerrarButton = findViewById(R.id.button_cerrar2);

        cerrarButton.setClickable(false);

    }

    public void onClick_siguienteButton(View view){
        Intent intent = new Intent(this, TerceroActivityMoscoso.class);
        intent.putExtra("textNombre",textoNombre.getText().toString());
        intent.putExtra("textApellido",textoApellido.getText().toString());

        startActivity(intent);
    }
}
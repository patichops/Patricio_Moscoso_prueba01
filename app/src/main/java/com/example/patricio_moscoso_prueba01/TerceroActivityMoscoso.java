package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerceroActivityMoscoso extends AppCompatActivity {

    private TextView textoNombre;
    private TextView textoApellido;

    private EditText numeroDividendo;
    private EditText numeroDivisor;
    private EditText numero;
    private Button cerrarButton;
    private ConstraintLayout layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceromoscoso_activity);

        layout3 = findViewById(R.id.layout3);
        textoNombre = findViewById(R.id.textViewNombre3);
        textoApellido = findViewById(R.id.textViewapellidos3);
        numeroDivisor = findViewById(R.id.editTextNumberDivisor3);
        numeroDividendo = findViewById(R.id.editTextNumberDividendo3);
        numero = findViewById(R.id.editTextNumberNumero3);
        cerrarButton = findViewById(R.id.button_cerrar3);

    }

    public void onClick_cerrarButton(View view){
        Intent intent = new Intent(this, SegundoActivityMoscoso.class);
        intent.putExtra("textoNombre",textoNombre.getText().toString());
        intent.putExtra("textoApellido",textoApellido.getText().toString());
        intent.putExtra("numeroDivisor",numeroDivisor.getText().toString());
        intent.putExtra("numeroDividendo",numeroDividendo.getText().toString());
        intent.putExtra("numero",numero.getText().toString());

        startActivity(intent);
        finish();
    }
}
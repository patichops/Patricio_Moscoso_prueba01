package com.example.patricio_moscoso_prueba01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeroActivityMoscoso extends AppCompatActivity {

    private TextView textoNombre;
    private TextView textoApellido;

    private TextView numeroUno;
    private TextView numeroDos;

    private Button siguienteButton;
    private Button mostrarResultadosButton;
    private ConstraintLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeromoscoso_activity);

        layout1 = findViewById(R.id.layout1);
        textoNombre = findViewById(R.id.nombretextView);
        textoApellido = findViewById(R.id.apellidotextView);
        numeroDos = findViewById(R.id.dividendotextView);
        numeroUno = findViewById(R.id.divisortextView);
        siguienteButton = findViewById(R.id.button_siguiente);

        Bundle bundle = this.getIntent().getExtras();
        if (bundle == null){
            Toast.makeText(this, "No existen datos", Toast.LENGTH_SHORT);
        }
        
        mostrarResultadosButton = findViewById(R.id.button_mostrarResultados);

        if (false)
            mostrarResultadosButton.setClickable(false);


    }

    public void onClick_ButtonSiguiente(View view){
        Intent intent = new Intent(this, SegundoActivityMoscoso.class);

        startActivity(intent);
    }
}
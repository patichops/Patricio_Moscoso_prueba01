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

        Bundle bundle = this.getIntent().getExtras();

        //if (this.getIntent().getType() == SegundoActivityMoscoso.class)

            if (bundle != null){
                textoNombre.setText(bundle.getString("textoNombre"));
                textoApellido.setText(bundle.getString("textoApellido"));
                numeroDividendo.setText(bundle.getString("numeroDivisor"));
                numeroDivisor.setText(bundle.getString("numeroDividendo"));
                numero.setText(bundle.getString("numero"));
            }


        cerrarButton.setClickable(false);

    }

    public void onClick_siguienteButton(View view){
        Intent intent = new Intent(this, TerceroActivityMoscoso.class);
        intent.putExtra("textNombre",textoNombre.getText().toString());
        intent.putExtra("textApellido",textoApellido.getText().toString());

        startActivity(intent);
    }

    public void onClick_cerrarButton(View view){
        Intent intent = new Intent(this, PrimeroActivityMoscoso.class);
        intent.putExtra("textoNombre",textoNombre.getText().toString());
        intent.putExtra("textoApellido",textoApellido.getText().toString());
        intent.putExtra("numeroDivisor",numeroDivisor.getText().toString());
        intent.putExtra("numeroDividendo",numeroDividendo.getText().toString());
        intent.putExtra("numero",numero.getText().toString());

        startActivity(intent);
        finish();
    }
}
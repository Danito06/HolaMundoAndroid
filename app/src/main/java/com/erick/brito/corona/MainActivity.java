package com.erick.brito.corona;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonDivis;
    private Button buttonMultiplicacion;
    private Button buttonConversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma );
        buttonSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirSuma();
            }

        });

        buttonResta = findViewById(R.id.buttonResta );
        buttonResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirResta();
            }

        });

        buttonDivis = findViewById(R.id.buttonDivis );
        buttonDivis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirDivis();
            }

        });

        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion );
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirMultiplicacion();
            }

        });

        buttonConversor = findViewById(R.id.buttonConversor );
        buttonConversor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirConversor();
            }

        });
    }

    private void abrirSuma(){
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity(intent);
    }
    private void abrirResta(){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);
    }
    private void abrirDivis(){
        Intent intent = new Intent(this, DivisionActivity.class);
        startActivity(intent);
    }
    private void abrirMultiplicacion(){
        Intent intent = new Intent(this, MultiplicacionActivity.class);
        startActivity(intent);
    }
    private void abrirConversor(){
        Intent intent = new Intent(this, Conversor.class);
        startActivity(intent);
    }
}
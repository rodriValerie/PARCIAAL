package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     private EditText primerNumero;
     private EditText segundoNumero;
     private TextView rvResultado;
    private TextView rvFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        primerNumero = findViewById(R.id.primerNumero);
        segundoNumero = findViewById(R.id.segundoNumero);
        rvResultado = findViewById(R.id.rvResultado);
        rvFact = findViewById(R.id.rvFact);
    }

    public void sumar(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());
        rvResultado.setText(String.valueOf(valor1+valor2));

    }
    public void multiplicar(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());

        rvResultado.setText(String.valueOf(valor1*valor2));

    }
    public void dividir(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());

        rvResultado.setText(String.valueOf(valor1/valor2));

    }
    public void restar(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());

        rvResultado.setText(String.valueOf(valor1-valor2));
    }
    public void factorial(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());
        int suma=valor1+valor2;
        Factorial fact=new Factorial(suma);
        rvFact.setText(String.valueOf(fact.Factorial(suma)));
    }


}
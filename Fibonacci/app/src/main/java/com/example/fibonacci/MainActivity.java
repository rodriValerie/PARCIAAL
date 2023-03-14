package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    private EditText numero;
    private TextView tvresul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        tvresul = findViewById(R.id.tvresul);

        Button botonCalcular = findViewById(R.id.botonCalcular);
        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = Integer.parseInt(numero.getText().toString());
                Fibonacci fibo = new Fibonacci(valor);

                for (int i = 0; i < valor; i++) {
                    tvresul.setText(String.valueOf(new Fibonacci(i)));
                }
            }
        });
    }
}
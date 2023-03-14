package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity : ComponentActivity() {

    override fun onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContent{
            calculadoraTheme
        }
    }

}
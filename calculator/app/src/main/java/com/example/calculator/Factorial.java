package com.example.calculator;

public class Factorial {
    public Factorial(int suma) {
        suma =0;
    }

    public int Factorial (int suma){
        if (suma==1){
            return 1;
        }else{
            return suma*Factorial(suma-1);
        }
    }
}

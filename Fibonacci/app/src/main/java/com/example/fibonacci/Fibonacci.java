package com.example.fibonacci;

public class Fibonacci {

    public Fibonacci(int i) {
    int valor=0;
    }

    public static int Fibonacci(int valor){
        if ((valor == 0) || (valor == 1)) {
            return valor;
        }else{
            return Fibonacci(valor-1)+Fibonacci(valor-2);
        }
    }
}

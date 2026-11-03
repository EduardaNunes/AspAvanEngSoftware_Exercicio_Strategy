package org.example.strategy;

public class CalculoMedia implements Calculo {

    public float calcular(float valor1, float valor2) {
        return (valor1 + valor2) / 2;
    }
}

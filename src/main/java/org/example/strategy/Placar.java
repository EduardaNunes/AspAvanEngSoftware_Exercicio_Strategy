package org.example.strategy;

public class Placar {

    private float valor1;
    private float valor2;

    public Placar(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(Calculo calculo) {
        return calculo.calcular(valor1, valor2);
    }
}

package org.example.strategy;

public class Lutador {

    private float pontuacao;

    public float getPontuacao() {
        return pontuacao;
    }

    public void somarPontuacao(float pontuacao1, float pontuacao2) {
        Placar placar = new Placar(pontuacao1, pontuacao2);
        this.pontuacao = placar.calcular(new CalculoSomar());
    }

    public void subtrairPontuacao(float pontuacao1, float pontuacao2) {
        Placar placar = new Placar(pontuacao1, pontuacao2);
        this.pontuacao = placar.calcular(new CalculoSubtrair());
    }

    public void dividirPontuacao(float pontuacao1, float pontuacao2) {
        Placar placar = new Placar(pontuacao1, pontuacao2);
        this.pontuacao = placar.calcular(new CalculoDividir());
    }

    public void multiplicarPontuacao(float pontuacao1, float pontuacao2) {
        Placar placar = new Placar(pontuacao1, pontuacao2);
        this.pontuacao = placar.calcular(new CalculoMultiplicar());
    }

    public void calcularMediaPontuacoes(float pontuacao1, float pontuacao2) {
        Placar placar = new Placar(pontuacao1, pontuacao2);
        this.pontuacao = placar.calcular(new CalculoMedia());
    }

}

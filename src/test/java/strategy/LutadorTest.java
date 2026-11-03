package strategy;

import org.example.strategy.Lutador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LutadorTest {

    @Test
    void deveSomarPontuacaoLutador() {
        Lutador lutador = new Lutador();
        lutador.somarPontuacao(8.0f, 2.0f);
        assertEquals(10.0f, lutador.getPontuacao());
    }

    @Test
    void deveSubtrairPontuacaoLutador() {
        Lutador lutador = new Lutador();
        lutador.subtrairPontuacao(10.0f, 1.0f);
        assertEquals(9.0f, lutador.getPontuacao());
    }

    @Test
    void deveMultiplicarPontuacaoLutador() {
        Lutador lutador = new Lutador();
        lutador.multiplicarPontuacao(8.0f, 1.5f);
        assertEquals(12.0f, lutador.getPontuacao());
    }

    @Test
    void deveDividirPontuacaoLutador() {
        Lutador lutador = new Lutador();
        lutador.dividirPontuacao(10.0f, 2.0f);
        assertEquals(5.0f, lutador.getPontuacao());
    }

    @Test
    void naoDeveDividirPontuacaoLutadorPorZero() {
        try {
            Lutador lutador = new Lutador();
            lutador.dividirPontuacao(10.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaPontuacoesLutador() {
        Lutador lutador = new Lutador();
        lutador.calcularMediaPontuacoes(9.0f, 10.0f);
        assertEquals(9.5f, lutador.getPontuacao());
    }

}

package Filas.Exercícios.E03;

import java.util.Comparator;

public enum CodigoPrioridade {
    VERMELHO(0),  AMARELO(1), VERDE(2);
    private final int valor;

    CodigoPrioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

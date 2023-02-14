package Filas.Exercícios.E03;

import java.util.Comparator;

public enum CodigoPrioridade {
    VERMELHO(1),  AMARELO(2), VERDE(3);
    private final int valor;

    CodigoPrioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

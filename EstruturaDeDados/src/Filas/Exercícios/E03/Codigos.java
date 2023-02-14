package Filas.Exercícios.E03;

import java.util.Comparator;

public class Codigos implements Comparable<Codigos> {
    enum Prioridade{
        VERMELHO(1), AMARELO(2), VERDE(3);
        private final int valor;
        Prioridade(int valor) {
            this.valor = valor;
        }
        public int getValor() {
            return valor;
        }
    }
    private Prioridade codigo;

    public Codigos(Prioridade codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Codigos codigo){

        if (this.codigo.getValor() > codigo.codigo.getValor()){
            return 1;
        } else if (this.codigo.getValor() < codigo.codigo.getValor()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Codigos{" +
                "codigo=" + codigo +
                '}';
    }
}

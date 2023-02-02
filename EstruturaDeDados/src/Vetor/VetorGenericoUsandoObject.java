package Vetor;

import java.util.Arrays;

public class VetorGenericoUsandoObject {
    private Object[] elementos;
    private int tamanho;

    public VetorGenericoUsandoObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // A B C D E + +
    // 0 1 2 3 4 5 6
    public boolean adiciona(int posicao, Object elemento) {
        if (posicao < 0 && posicao > tamanho) throw new IllegalArgumentException("Posição Inválida!");

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        if (posicao < 0 && posicao > tamanho) throw new IllegalArgumentException("Posição Inválida!");
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) return i;
        }
        return -1;
    }

    //remove elemento e move demais elementos para preencher slot vazio (nulo)
    public void remove(int posicao) {
        if (posicao < 0 && posicao > tamanho) throw new IllegalArgumentException("Posição Inválida!");
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
//        if (this.tamanho > 0) {
//            s.append(this.elementos[this.tamanho - 1]);
//        }
        s.append("]");

        return s.toString();
    }
}

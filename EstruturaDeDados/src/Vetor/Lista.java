package Vetor;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista() {
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        this.elementos[tamanho] = elemento;
        this.tamanho++;
        return true;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao >= tamanho) throw new IllegalArgumentException("Posição Inválida");
        this.aumentaCapacidade();
        for (int i = tamanho; i > posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.tamanho * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //    public T obtem(int posicao){
//        return this.busca(posicao);
//    }
    public T busca(int posicao) {
        if (posicao < 0 || posicao >= tamanho) throw new IllegalArgumentException("Posição Inválida");

        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho - 1; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) throw new IllegalArgumentException("Posição Inválida");
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    

}

package Pilhas;

import EstruturaEstatica.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elementa) {
        super.adiciona(elementa);
    }

    public T topo() {
        if (this.estaVazia()) return null;
        return this.elementos[tamanho - 1];
    }
    public T desempilha(){
        if(this.estaVazia()) return null;
        return this.elementos[--tamanho];
    }

}

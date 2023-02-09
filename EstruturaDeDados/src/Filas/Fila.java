package Filas;

import EstruturaEstatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    public void enfileirar(int posicao, T elemento) {
        super.adiciona(posicao, elemento);
    }
    public T espiar(){
        if (this.estaVazia()) return null;
        return this.elementos[0];
    }
    // A + B + C + D + E -> Remove o primeiro termo (0)
    // B + C + D + E
    public T desenfileirar(){
        T retorno = this.elementos[0];
        if (this.estaVazia()) throw new IllegalArgumentException("Fila está vazia");
        for (int i = 0; i < tamanho - 1;i++){
            elementos[i] = elementos[i+1];
        }
        this.tamanho--;

        return retorno;
    }

}

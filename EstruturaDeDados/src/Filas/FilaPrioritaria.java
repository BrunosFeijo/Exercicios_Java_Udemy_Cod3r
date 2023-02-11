package Filas;

public class FilaPrioritaria<T> extends Fila<T> {
    @Override
    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i = 0;
        while (i < this.tamanho){
            if (chave.compareTo(this.elementos[i]) < 0) break;

            i++;
        }
        this.adiciona(i,elemento);
    }
}

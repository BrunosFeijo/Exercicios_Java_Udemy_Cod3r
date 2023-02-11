package Filas.Exercícios.E01;
// Usando uma Queue, crie uma fila de documentos que precisam ser impressos.
// Cada documeto é composto de um nome e quatidade de folhas a serem impressas. O programa deve:
// * Enfileirar os documentos
// * E seguindo a ordem, o programa deve "imprimir" cada documento. Se desejar pode usar Threads para esperar
// a impressão de acordo com o número de folhas a serem impressas.

public class E01 {
    public static void main(String[] args) throws InterruptedException {
        ImprimirFila fila = new ImprimirFila();
        fila.enfileirar(new Documento("A", 4));
        fila.enfileirar(new Documento("B", 10));
        fila.enfileirar(new Documento("C", 7));

        fila.imprimir();
    }

}

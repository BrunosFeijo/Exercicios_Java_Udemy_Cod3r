package Filas.Exercícios.E01;

import java.util.LinkedList;
import java.util.Queue;

public class ImprimirFila {
    private Queue<Documento> fila;

    public ImprimirFila() {
        fila = new LinkedList<>();
    }
    public void enfileirar(Documento documento){
        fila.add(documento);
    }

    public void imprimir() throws InterruptedException {
        while (!fila.isEmpty()) {
            Documento doc = fila.poll();
            System.out.println("Imprimindo documento: " + doc.getNome() + " com " + doc.getQtd() + " folhas.");
            Thread.sleep(doc.getQtd() * 1000);
            System.out.println("Documento Finalizado: " + doc.getNome()+ " com " + doc.getQtd() + " folhas.");
        }
    }

}

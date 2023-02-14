package Filas.Exercícios.E03;

import java.util.PriorityQueue;
import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        PriorityQueue<CodigoPrioridade> fila = new PriorityQueue<>();
        Random prioridade = new Random();
        int valor = prioridade.nextInt(3);

        switch (valor) {
            case 0:
                fila.add(CodigoPrioridade.VERMELHO);
                System.out.println("Paciente VERMELHO chegou");
                break;
            case 1:
                fila.add(CodigoPrioridade.AMARELO);
                System.out.println("Paciente AMARELO chegou");
                break;
            case 2:
                fila.add(CodigoPrioridade.VERDE);
                System.out.println("Paciente VERDE chegou");
                break;
        }
    }
}

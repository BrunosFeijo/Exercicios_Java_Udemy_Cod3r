package Filas.Exercícios.E03;
// Utilize a classe Fila para similar um sistema de senhas de um pronto Socorro. Cada pessoa pode ser
// classificada com 3 códigos:  vermelho (maior prioridade), amarelo (prioridade média) e verde.
// * Enfileire 6 pessoas na fila inicial.
// * Pessoas com prioridade vermelha devem ser atendidas primeiro;
// * Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
// * A cada 4 segundos, uma pessoa chega no PS com prioridade aleatória.

import java.util.PriorityQueue;
import java.util.Random;

public class E03 {
    public static void main(String[] args) {
        PriorityQueue<CodigoPrioridade> fila = new PriorityQueue<>();

        fila.add(CodigoPrioridade.VERDE);
        fila.add(CodigoPrioridade.VERMELHO);
        fila.add(CodigoPrioridade.AMARELO);
        fila.add(CodigoPrioridade.VERMELHO);
        fila.add(CodigoPrioridade.VERDE);
        fila.add(CodigoPrioridade.AMARELO);

        Thread atendimento = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!fila.isEmpty()){
                    try {
                        atendimento(fila);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Atendimento finalizado!");
            }
        });
        Thread chegadaNovoPaciente = new Thread(new Runnable() {
            @Override
            public void run() {
                while (fila.size() != 10){
                    try {
                        chegada(fila);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
            atendimento.start();
            chegadaNovoPaciente.start();
    }

    public static void atendimento(PriorityQueue fila) {
        System.out.println("Paciente " + fila.poll() + " está sendo atendido");
    }

    public static void chegada(PriorityQueue fila) {
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

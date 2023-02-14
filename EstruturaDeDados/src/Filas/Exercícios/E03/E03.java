package Filas.Exercícios.E03;
// Utilize a classe Fila para similar um sistema de senhas de um pronto Socorro. Cada pessoa pode ser
// classificada com 3 códigos:  vermelho (maior prioridade), amarelo (prioridade média) e verde.
// * Enfileire 6 pessoas na fila inicial.
// * Pessoas com prioridade vermelha devem ser atendidas primeiro;
// * Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
// * A cada 4 segundos, uma pessoa chega no PS com prioridade aleatória.

import java.util.PriorityQueue;

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


            }
        });
        Thread chegadaNovoPaciente = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
    public static void atendimento(PriorityQueue fila){
        System.out.println("Paciente " + fila.poll() + " está sendo atendido");
    }

    
}

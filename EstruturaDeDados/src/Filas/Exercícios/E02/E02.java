package Filas.Exercícios.E02;
// Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas.
// Cada pessoa pode receber uma senha prioritária ou uma senha normal.O programa deve obedecer os seguintes critérios:
// * Existe apenas um atendente
// * 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
// * Não havendo prioridades, as pessoas com senha normal podem ser atendidas.

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Queue<OpcaoAtendimento> filaNormal = new LinkedList<>();
        PriorityQueue<OpcaoAtendimento> filaPrioritaria = new PriorityQueue<>();
        OpcaoAtendimento valor = opcaoAtendimento();

        while (valor != null) {
            if (valor == OpcaoAtendimento.NORMAL) {
                filaNormal.add(OpcaoAtendimento.NORMAL);
            } else if (valor == OpcaoAtendimento.PRIORITARIO) {
                filaPrioritaria.add(OpcaoAtendimento.PRIORITARIO);
            }

            valor = opcaoAtendimento();
        }

        while(!filaPrioritaria.isEmpty() || !filaNormal.isEmpty()){
            for (int i = 0; i < 3 && !filaPrioritaria.isEmpty(); i++) {
                System.out.println(filaPrioritaria.poll());
            }
            System.out.println(filaNormal.poll());
        }
    }

    static OpcaoAtendimento opcaoAtendimento() {
        Scanner entrada = new Scanner(System.in);
        int valor = -1;

        while (valor != 0 && valor != 1 && valor != 2) {
            System.out.println("Digite 1 (NORMAL) ou 2 (PRIORITÁRIO) ou 0 (SAIR)");
            valor = entrada.nextInt();
            switch (valor) {
                case 1:
                    return OpcaoAtendimento.NORMAL;
                case 2:
                    return OpcaoAtendimento.PRIORITARIO;
                case 0:
                    return null;
            }
        }
        return null;
    }
}

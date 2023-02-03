package Pilhas.Exercicios;
//Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir:
// * Se o número for par, empilhe na pilha;
// * Se o número for ímpar, desempilhe um número da pilha. Caso a pilha esteja vazia, mostre uma mensagem
// * Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, imprimindo-os na tela

import Pilhas.Pilha;

import java.util.Random;

public class E01 {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha<Integer> pilha = new Pilha<>();
        int num = -1;

        System.out.println("Ler números: ");
        for (int i = 0; i < 10; i++) {
            num = random.nextInt(100);
            //System.out.println(num);
            if ((num % 2) == 0) {
                pilha.empilha(num);
            } else if (pilha.estaVazia()) {
                System.out.println("Não foi possivel desempilhar nenhum elemento. Pilha vazia.");
            } else {
                pilha.desempilha();
            }
        }

        System.out.println("\nAinda existem numeros na pilha?");
        if (!pilha.estaVazia()) {
            for (int i = pilha.tamanho() - 1; i >= 0; i--) {
                System.out.println(pilha.topo());
                pilha.desempilha();
            }
        }
    }
}

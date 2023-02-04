package Pilhas.Exercicios;
// Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir:
// * Se o número for par, empilhe na pilha chamada par;
// * Se o número for ímpar, empilhe na pilha chamada ímpar;
// * Se o número for zero (0), desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia mostre uma mensagem.
// * Ao final, desempilhe todos os números das duas pilhas.

import Pilhas.Pilha;

import java.util.Random;

public class E02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Random random = new Random();
        int num = -1;

        System.out.println("Lendo números: ");
        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10);
            System.out.println(num);
            if (num != 0) {
                if ((num % 2) == 0) par.empilha(num);
                if ((num % 2) == 1) impar.empilha(num);
            } else {
                if (par.estaVazia()) {
                    System.out.println("Pilha Par: vazia");
                } else {
                    System.out.println("Desenpilhado par: "+ par.desempilha());
                }
                if (impar.estaVazia()) {
                    System.out.println("Pilha Ímpar: vazia");
                } else {
                    System.out.println("Desenpilhado ímpar: "+ impar.desempilha());
                }
            }
        }

        System.out.println("\nAinda existem numeros na pilha Par?");
        if (!par.estaVazia()) {
            for (int i = par.tamanho() - 1; i >= 0; i--) {
                System.out.println(par.desempilha());
            }
        }
        System.out.println("\nAinda existem numeros na pilha Ímpar?");
        if (!impar.estaVazia()) {
            for (int i = impar.tamanho() - 1; i >= 0; i--) {
                System.out.println(impar.desempilha());
            }
        }
    }
}

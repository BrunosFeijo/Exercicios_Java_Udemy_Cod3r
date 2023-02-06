package Pilhas.Exercicios;
// Usando uma pilha, desenvolva um programa queresolva o quebra cabeça Torre de Hanoi

import java.util.Stack;
import java.util.function.Consumer;

public class E06 {
    public static void main(String[] args) {
        Stack<Integer> torreA = new Stack<>();
        Stack<Integer> torreB = new Stack<>();
        Stack<Integer> torreC = new Stack<>();

        System.out.println("Quantas peças a torre terá?");
        preencherPilha(torreA, 3);

        System.out.println("*****");
        System.out.println("Torre A: " + torreA);
        System.out.println("Torre B: " + torreB);
        System.out.println("Torre C: " + torreC);
        torreDeHanoi(torreA.size(), torreA, torreB, torreC);

    }

    public static void torreDeHanoi(int n, Stack<Integer> torreA, Stack<Integer> torreB, Stack<Integer> torreC) {
        Consumer<Integer> imprimir = p -> System.out.println(p);
        if (n > 0) {
            torreDeHanoi(n - 1, torreA, torreC, torreB);
            torreB.push(torreA.pop());
            System.out.println("*****");
            System.out.println("Torre A: " + torreA);
            System.out.println("Torre B: " + torreB);
            System.out.println("Torre C: " + torreC);
            torreDeHanoi(n - 1, torreC, torreB, torreA);
        }
    }

    public static void preencherPilha(Stack<Integer> torreA, int numero) {
        for (int i = numero; i > 0; i--) {
            torreA.push(i);
        }
    }
}
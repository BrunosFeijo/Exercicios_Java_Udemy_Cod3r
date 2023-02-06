package Exercicios;
// Escreva um método recursivo e estatico que calcule e retorne o enésimo termo da sequência Fobonacci.

public class FibonacciRecursivo {
    public static void main(String[] args) {

        imprimirFibonacci(10);
    }
    public static void imprimirFibonacci(int num){
        for (int i = 0; i < num;i++) System.out.print(fibonacciRecursivo(i) + " ");
    }

    public static int fibonacciRecursivo(int num) {
        if (num <= 1) return num;

        return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
    }
}


package Exercicios;
// Escreva um método recursivo e estático que receba um número inteiro positivo N
// e calcule o somatório dos números de 1 a n.

public class SomaRecursiva {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("A dos Termos da PA de 1 a " + num + " é: " + somaTermosPA(num));
    }
    public static int somaTermosPA(int num){
        if(num == 1) return 1;
        return somaTermosPA(num -1) + num;
    }
}

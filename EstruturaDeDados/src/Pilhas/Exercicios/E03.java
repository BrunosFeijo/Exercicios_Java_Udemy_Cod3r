package Pilhas.Exercicios;
// Usando uma pilha, leia uma String e retorne se ela é um palíndromo ou não.
// * ANA = TRUE
// * ABCDCBA = TRUE
// * ABCDFG = FALSE

import Pilhas.Pilha;

public class E03 {
    public static void main(String[] args) {
        String palavra1 = "Ana";
        String palavra2 = "ABCDCBA";
        String palavra3 = "ABCDFG";

        System.out.println("Ana -> "+ verificarPalindromo(palavra1));
        System.out.println("ABCDCBA -> "+ verificarPalindromo(palavra2));
        System.out.println("ABCDFG -> "+ verificarPalindromo(palavra3));
    }
    public static boolean verificarPalindromo(String palavra){
        Pilha<Character> pilha = new Pilha<>(palavra.length());
        String palavraInvertida = "";

        for (int i = 0; i < palavra.length();i++){
            pilha.empilha(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length();i++){
            palavraInvertida += pilha.desempilha();
        }

        if (palavra.equalsIgnoreCase(palavraInvertida)) return true;

        return false;
    }
}

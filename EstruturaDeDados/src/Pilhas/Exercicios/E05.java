package Pilhas.Exercicios;
// Usando uma Pilha, desenvolva um algorítimo que faça a conversão de números decimais para outras bases.

import java.util.Stack;

public class E05 {
    public static void main(String[] args) {

        imprimeResultado(2,2);
        imprimeResultado(30,2);
        imprimeResultado(56,8);
        imprimeResultado(45,8);
        imprimeResultado(17,16);
        imprimeResultado(1212,16);
    }

    public static void imprimeResultado(int numero, int base) {
        System.out.println(numero + " na base " + base + " é: " + conversorDeBase(numero, base));
    }

    public static String conversorDeBase(int numero, int base) {
        if (base > 16) {
            throw new IllegalArgumentException("Não é possivel converter base maior que 16 (hexadecimal)");
        }

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";

        int resto;
        String bases = "0123456789ABCDF";
        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) numBase += bases.charAt(pilha.pop());
        return numBase;
    }
}

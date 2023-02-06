package Pilhas.Exercicios;
// Escreva um programa para verificar se uma expressão matemática tem os parênteses agrupados de forma correta, isto é:
// *


import java.util.Stack;

public class E04 {
    public static void main(String[] args) {
            imprimeResultado("A+B");
            imprimeResultado("(A+B)");
            imprimeResultado(")A+B(");
            imprimeResultado("(A+B(");
            imprimeResultado("{[(A+B)]}");
    }
    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado? " +
                            verificaSimbolos((expressao)));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolos(String expressao){
        Stack<Character> pilha = new Stack<Character>();
        char simbolo, topo;

        for (int indice = 0; indice < expressao.length(); indice++){
            simbolo = expressao.charAt(indice);
            if (ABRE.indexOf(simbolo) > -1){
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                 if (pilha.isEmpty()){
                     return false;
                 }else{
                     topo = pilha.pop();
                     if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                         return false;
                     }
                 }
            }
        }
        return pilha.isEmpty();
    }
}

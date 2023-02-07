package Strings;

public class Buscadores {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x')); // -1 não existe
        System.out.println(banana.indexOf('a')); // 1 retorna o indice quando encontra
        System.out.println(banana.indexOf('b')); // 0 retorna o indice quando encontra

        System.out.println(banana.indexOf(ana)); // 1 retona o indice do inicio do trecho

        System.out.println(banana.lastIndexOf('a')); // 5 retorna a última ocorrência
        System.out.println(banana.lastIndexOf(ana)); // 3

        System.out.println(banana.contains(ana)); // retorna true
        System.out.println(banana.contains("x")); // retorna false
    }
}

package br.com.CursoJava;

import br.com.CursoJava.modelo.Tabuleiro;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        tabuleiro.abrir(3,3);
        tabuleiro.alternarMarcacao(4,4);
        tabuleiro.alternarMarcacao(4,5);
        System.out.println(tabuleiro);
    }
}

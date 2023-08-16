package br.com.CursoJava;

import br.com.CursoJava.modelo.Tabuleiro;
import br.com.CursoJava.visao.TabuleiroConsole;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);
    }
}

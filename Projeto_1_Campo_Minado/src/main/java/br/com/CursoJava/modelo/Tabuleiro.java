package br.com.CursoJava.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private int qtdLinhas;
    private int qtdColunas;
    private int qtdMinas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int qtdLinhas, int qtdColunas, int qtdMinas) {
        this.qtdLinhas = qtdLinhas;
        this.qtdColunas = qtdColunas;
        this.qtdMinas = qtdMinas;

        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    private void gerarCampos() {
        for (int lin = 0; lin < qtdLinhas; lin++) {
            for (int col = 0; col < qtdColunas; col++) {
                campos.add(new Campo(lin, col));
            }
        }
    }

    private void associarOsVizinhos() {
        for (Campo campo1 : campos) {
            for (Campo campo2 : campos) {
                campo1.adicionarVizinho(campo2);
            }
        }
    }

    private void sortearMinas() {
    }
}

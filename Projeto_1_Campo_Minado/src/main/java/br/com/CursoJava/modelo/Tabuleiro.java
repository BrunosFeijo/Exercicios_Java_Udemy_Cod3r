package br.com.CursoJava.modelo;

import br.com.CursoJava.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
    public void abrir(int linha, int coluna){
        try {
            campos.stream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst()
                .ifPresent(Campo::abrir);
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }
    public void alternarMarcacao(int linha, int coluna){
        campos.stream()
            .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
            .findFirst()
            .ifPresent(Campo::alternarMarcacao);
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
        long minasArmadas = 0;
        Predicate<Campo> minado = Campo::isMinado;

        do{
            int aleatorio = (int)(Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        }while(minasArmadas < qtdMinas);
    }
    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }
    public void reiniciar(){
        campos.forEach(Campo::reinciar);
        sortearMinas();
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (int lin = 0; lin < qtdLinhas; lin++) {
            for (int col = 0; col < qtdColunas; col++) {
                stringBuilder.append(" ").append(campos.get(i)).append(" ");
                i++;
            }
            stringBuilder.append("\n");
        }
        return  stringBuilder.toString();
    }
}

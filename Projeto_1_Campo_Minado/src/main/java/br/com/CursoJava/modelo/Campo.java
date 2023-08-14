package br.com.CursoJava.modelo;

import br.com.CursoJava.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean minado;
    private boolean aberto;
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }
    }

    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrir() {
        if (!aberto && !marcado) {
            aberto = true;
            if (minado) {
                throw new ExplosaoException();
            }
            if (vizinhancaSegura()) {
                vizinhos.forEach(Campo::abrir);
            }
            return true;
        } else {
            return false;
        }
    }
    void minar(){
        minado = true;
    }

    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }
    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return protegido || desvendado;
    }
    long minasNaVizinhanca(){
        return vizinhos.stream().filter(Campo::isMinado).count();
    }
    void reinciar(){
        aberto = minado = marcado = false;
    }

    @Override
    public String toString() {
        if(marcado){
            return "x";
        }else if(aberto && minado){
            return "*";
        } else if (aberto && minasNaVizinhanca() > 0) {
            return Long.toString(minasNaVizinhanca());
        } else if (aberto) {
            return " ";
        }else{
            return "?";
        }
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isMinado() {
        return minado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isMarcado() {
        return marcado;
    }
}

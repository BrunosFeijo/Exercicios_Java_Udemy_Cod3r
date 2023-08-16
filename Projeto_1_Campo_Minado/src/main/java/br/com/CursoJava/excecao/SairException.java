package br.com.CursoJava.excecao;

public class SairException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Fim de Jogo!!";
    }
}

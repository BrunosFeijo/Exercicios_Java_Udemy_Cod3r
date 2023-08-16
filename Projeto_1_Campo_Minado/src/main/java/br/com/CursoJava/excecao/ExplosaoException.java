package br.com.CursoJava.excecao;

public class ExplosaoException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Você perdeu!!";
    }
}

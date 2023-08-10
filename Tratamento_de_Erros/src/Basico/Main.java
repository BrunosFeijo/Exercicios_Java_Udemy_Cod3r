package Basico;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = null;

        try {
            imprimirNome(aluno);
        } catch (Exception e) { // tratamento genérico
            System.out.println("Ocorreu um erro ao imprimir nome");
        }

        try {
            System.out.println( 5 / 0);
        } catch (ArithmeticException e) { // tratamento específico
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Fim");
    }
    public static void imprimirNome(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
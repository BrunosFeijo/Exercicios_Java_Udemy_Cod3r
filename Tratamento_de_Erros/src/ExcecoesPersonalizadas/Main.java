package ExcecoesPersonalizadas;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("", 7);
        Aluno aluno2 = new Aluno("Ana", -7);
        Aluno aluno3 = null;
        try {
            //Validar.aluno(aluno1); nom vazio
            //Validar.aluno(aluno2); nota fora do intervalo
            Validar.aluno(aluno3); // nulo
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}

package POO_Composicao.MuitosPraMuitos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);


        for (Aluno aluno: curso3.alunos){
            System.out.println("Curso: " + curso3.nome);
            System.out.println("Nome: " + aluno.nome);
            System.out.println();
        }

        System.out.println("Todos os alunos do Curso 'Java Completo'");
        System.out.println(curso1.alunos + "\n");

        System.out.println("Todos os cursos da Maria");
        System.out.println(aluno2.cursos);

        //Localizar o curso em "aluno x" e mostrar os alunos matriculados neste curso
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Web 2023");
        System.out.println();

        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}

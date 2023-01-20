package POO_Composicao.MuitosPraMuitos;

import java.util.ArrayList;

public class Curso {
    ArrayList<Aluno> alunos = new ArrayList<>();
    String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return "Curso{" + nome + '}';
    }
}

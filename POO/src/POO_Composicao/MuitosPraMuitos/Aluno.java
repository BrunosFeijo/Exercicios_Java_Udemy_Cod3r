package POO_Composicao.MuitosPraMuitos;

import java.util.ArrayList;

public class Aluno {
    ArrayList<Curso> cursos = new ArrayList<>();
    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nomeCurso) {
        for (Curso curso : cursos) {
            if (curso.nome.equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Aluno{" + nome + '}';
    }
}

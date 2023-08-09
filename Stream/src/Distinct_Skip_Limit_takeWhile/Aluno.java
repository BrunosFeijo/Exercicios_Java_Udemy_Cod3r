package Distinct_Skip_Limit_takeWhile;

import java.util.Objects;

public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(aluno.nota, nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public String toString() {
        return nome + " nota: " + nota;
    }
}

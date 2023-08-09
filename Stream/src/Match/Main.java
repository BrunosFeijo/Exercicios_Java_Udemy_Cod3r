package Match;

import Reduce.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Match.Aluno a1 = new Match.Aluno("Ana", 7.1);
        Match.Aluno a2 = new Match.Aluno("Luna", 6.1);
        Match.Aluno a3 = new Match.Aluno("Gui", 8.1);
        Match.Aluno a4 = new Match.Aluno("Gabi", 10);

        List<Match.Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Match.Aluno> aprovado = aluno -> aluno.nota >= 7;

    }
}

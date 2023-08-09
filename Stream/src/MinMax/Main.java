package MinMax;

import Match.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MinMax.Aluno a1 = new MinMax.Aluno("Ana", 7.1);
        MinMax.Aluno a2 = new MinMax.Aluno("Luna", 7.5);
        MinMax.Aluno a3 = new MinMax.Aluno("Gui", 8.1);
        MinMax.Aluno a4 = new MinMax.Aluno("Gabi", 10);

        List<MinMax.Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Comparator<MinMax.Aluno> melhorNota = Comparator.comparingDouble(aluno -> aluno.nota);

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}

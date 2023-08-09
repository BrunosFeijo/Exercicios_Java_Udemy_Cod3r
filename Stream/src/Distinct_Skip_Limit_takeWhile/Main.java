package Distinct_Skip_Limit_takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana",7.1);
        Aluno a2 = new Aluno("Luna",6.1);
        Aluno a3 = new Aluno("Gui",8.1);
        Aluno a4 = new Aluno("Gabi",10);
        Aluno a5 = new Aluno("Ana",7.1);
        Aluno a6 = new Aluno("Pedro",5.1);
        Aluno a7 = new Aluno("Gui",8.1);
        Aluno a8 = new Aluno("Maria",10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
        Consumer<Aluno> println = System.out::println;

        System.out.println("Distinct -> Remove duplicados");
        alunos.stream()
                .distinct()
                .forEach(println); // necessário criar equals e hashcode na classe Aluno

        System.out.println("\nSkip/Limit -> skip: pula elementos - limit: limita qtd de retornos");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(println); // pula os dois primeiros e traz apenas 2 resultados

        System.out.println("\ntakeWhile -> retorna enquanto a condição for verdadeira");
        alunos.stream()
                .distinct()
                .skip(3)
                .takeWhile(aluno -> aluno.nota >= 7)
                .forEach(println); // pula os três primeiros e busca os alunos até encontrar um reprovado
    }
}

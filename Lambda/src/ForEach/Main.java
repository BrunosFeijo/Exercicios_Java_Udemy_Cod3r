package ForEach;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Metódo Tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("\nCom Lambdas...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}

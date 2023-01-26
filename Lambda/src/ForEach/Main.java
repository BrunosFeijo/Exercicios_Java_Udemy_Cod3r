package ForEach;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Metódo Tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("\nCom Lambdas #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
        System.out.println("\nCom Lambdas #02...");
        aprovados.forEach(nome -> imprimir(nome));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);
        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Main::imprimir);
    }

    static void imprimir(String nome){
        System.out.println(nome + "***");
    }
}

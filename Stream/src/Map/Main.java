package Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> lista = Arrays.asList("Fiat ", "Audi ", "Honda ");
        lista.stream().map(String::toUpperCase).forEach(print);

        System.out.println("\n\nUsando composição(Interface funcional + Classe + Método)...");
        // UnaryOperator<String> maiuscula = String::toUpperCase;
        UnaryOperator<String> primeiraLetra = x -> x.charAt(0) + "";
        // UnaryOperator<String> grito = x -> x + "!!! ";

        lista.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}

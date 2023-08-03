package CriandoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<String> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        System.out.println("Usa ForEach ligado ao stream diretamente...");
        langs.forEach(print);

        String[] maisLangs = {"Python ","Lisp ", "Pearl ", "Go\n"};

        System.out.println("\nUsa ForEach a um array (Stream.of)...");
        Stream.of(maisLangs).forEach(print);
        System.out.println("\nUsa ForEach a um array (Arrays.stream)...");
        Arrays.stream(maisLangs).forEach(print);
        System.out.println("\nUsa ForEach a um array (Arrays.stream com inicio e fim)...");
        Arrays.stream(maisLangs,1,3).forEach(print);

        List<String> outrasLangs= Arrays.asList("C ", "PHP ","Kotlin");
        System.out.println();
        System.out.println("\nUsa uma List.stream...");
        outrasLangs.stream().forEach(println);
        System.out.println("\nUsa uma List.parallelStream...");
        outrasLangs.parallelStream().forEach(println);

        //Streams infinitas
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0,n -> n+1).forEach(println);


    }
}

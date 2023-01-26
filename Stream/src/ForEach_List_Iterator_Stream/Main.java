package ForEach_List_Iterator_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Usando ForEach...");
        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> stream = lista.stream();
        stream.forEach(System.out::println);

        System.out.println("\nUsando a própria List...");
        lista.forEach(System.out::println);
    }
}

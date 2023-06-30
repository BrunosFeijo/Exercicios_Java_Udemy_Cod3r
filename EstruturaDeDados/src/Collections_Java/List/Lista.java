package Collections_Java.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lista {
    public static void main(String[] args) {
        Predicate<String> isMaiorQueJ = palavra -> palavra.charAt(0) > 'J' ;
        List<String> lista = new ArrayList<>();
        lista.add("Bruno");
        lista.add("Guilherme");
        lista.add("Ricardo");
        lista.add("Daniel");
        lista.add("Leonardo");
        lista.add("Guilherme");

        System.out.println("Lista apenas com ordem de inserção: " + lista);
        System.out.println("Ricardo está no índice: " + lista.indexOf("Ricardo"));
        System.out.println("Última ocorrência de Guilherme na lista (índice): " + lista.lastIndexOf("Guilherme"));
        lista.set(2,"Teste");
        System.out.println("Lista após substituir o elemento no índice 2: " + lista);
//        Collections.sort(lista); pode ordenar tbm
        lista.sort(Comparator.naturalOrder());
        System.out.println("Lista ordenada: " + lista);
        lista.removeIf(isMaiorQueJ);
        System.out.println("Lista após remover elementos que começam com letras maiores que 'J': "+ lista);
    }
}

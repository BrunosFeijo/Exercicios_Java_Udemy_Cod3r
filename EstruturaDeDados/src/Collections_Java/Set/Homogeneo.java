package Collections_Java.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Homogeneo {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        lista.add("Ana");
        lista.add("Luciana");
        lista.add("Maria");
        lista.add("Eduarda");
        lista.add("Bruna");
        System.out.println("Set não ordenado: " + lista);

        SortedSet<String> listaOrdenada = new TreeSet<>();
        listaOrdenada.addAll(lista);
        System.out.println("Set ordenado" + listaOrdenada);
        System.out.println("1° da lista: " + listaOrdenada.first());
        System.out.println("Último da lista: " + listaOrdenada.last());
        System.out.println("Entre 'B' e 'L': " + listaOrdenada.subSet("B", "M"));
        System.out.println("Todos os elementos até 'J': " + listaOrdenada.headSet("L"));
        System.out.println("Todos os elementos após 'J': " + listaOrdenada.tailSet("L"));

    }
}

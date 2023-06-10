package Collections_Java.List;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
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
    }
}

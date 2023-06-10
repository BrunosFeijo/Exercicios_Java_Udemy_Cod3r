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

        System.out.println("Lista apenas ordem de inserção: " + lista);
        System.out.println("Ricardo está no índice: " + lista.indexOf("Ricardo"));
        System.out.println("última ocorrência de Guilherme na lista: " + lista.lastIndexOf("Guilherme"));
        
    }
}

import Filas.Classe1;
import Filas.Fila;
import Filas.Interface1;

import java.util.LinkedList;
import java.util.Queue;

public class Teste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);

        System.out.println(fila);
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila);

        Queue<Integer> fila1 = new LinkedList<>();

        fila1.add(3);
        fila1.add(2);
        fila1.add(1);

        System.out.println(fila1);
        System.out.println(fila1.remove());
        System.out.println(fila1);


//        Interface1 teste = new Classe1();
//
//        teste.adiciona();
//        teste.remove();
//        teste.teste();  // ocorre erro
    }
}

package Collections_Java.Queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<java.io.Serializable> filaHeterogenea = new LinkedList<>();
        filaHeterogenea.add("Bruno");
        filaHeterogenea.add(2);
        filaHeterogenea.add(true);

        System.out.println(filaHeterogenea);

        Queue<Integer> fila = new ArrayDeque<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(8);
        fila.add(6); // exceção
        fila.offer(7); // false

        System.out.println(fila);
        System.out.println("Espiar primeiro elemento: " + fila.element()); // exceção
//        System.out.println(fila.peek()); // null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // null
        System.out.println(fila.remove()); // exceção
    }
}

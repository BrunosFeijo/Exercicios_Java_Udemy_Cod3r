package Collections_Java.ArrayDoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class FilaDeFinalDuplo {
    public static void main(String[] args) {
        Deque<Integer> pilha = new ArrayDeque<>();

        pilha.add(2);
        pilha.offer(3);
        pilha.push(1); // inicio
        pilha.offerFirst(0);
        pilha.offerLast(4);

        System.out.println(pilha);
    }
}

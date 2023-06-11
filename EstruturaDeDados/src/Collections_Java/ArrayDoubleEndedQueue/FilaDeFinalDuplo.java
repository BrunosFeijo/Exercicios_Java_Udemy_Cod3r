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
        System.out.println("Início da pilha: " + pilha.getFirst());
        System.out.println("Fim da pilha: " + pilha.getLast());
        System.out.println("Removido do inicio (pop): " + pilha.pop());
        System.out.println("Removido do inicio (poll): " + pilha.poll());
        System.out.println("Removido do fim : " + pilha.pollLast());
        System.out.println("Removido do fim : " + pilha.removeLast());

        System.out.println("Último removido: " + pilha.pop());
        System.out.println("Pilha vazia: " + pilha.poll()); // null
//        System.out.println("Pilha vazia: " + pilha.removeFirst()); // exceção
//        System.out.println("Pilha vazia: " + pilha.pop()); // exceção

    }
}

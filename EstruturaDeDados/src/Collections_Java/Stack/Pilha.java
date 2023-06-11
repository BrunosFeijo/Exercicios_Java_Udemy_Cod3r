package Collections_Java.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> livros = new Stack<>();
        livros.add("O Pequeno Príncipe");
        livros.addElement("Don Quixote");
        livros.push("O Hobbit");
        for (String livro: livros){
            System.out.println(livro);
        }
        System.out.println("Capaidade Atual: " + livros.capacity());
        livros.trimToSize();
        System.out.println("Capacidade após usar trimToSize(): " + livros.capacity());

        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.pop());

    }
}

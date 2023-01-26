package UsandoPacotesInterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p);

        Produto p1 = new Produto("Caneta", 12.30,0.10);
        Produto p2 = new Produto("Borracha", 5,0.10);
        Produto p3 = new Produto("Caderno", 18.90,0.10);
        Produto p4 = new Produto("Lápis", 7,0.10);

        List<Produto> list = Arrays.asList(p1,p2,p3,p4);
        list.forEach(imprimir);

    }
}

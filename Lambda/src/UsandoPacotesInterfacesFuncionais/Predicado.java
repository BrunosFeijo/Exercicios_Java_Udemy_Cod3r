package UsandoPacotesInterfacesFuncionais;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        //Recebe um TIPO e retorna um boolean
        Predicate<Produto> isCaro = produto -> (produto.preco * (1- produto.desconto)) >=750;

        Produto produto = new Produto("Notebook", 3893.89,0.15);
        System.out.println(isCaro.test(produto));
    }
}


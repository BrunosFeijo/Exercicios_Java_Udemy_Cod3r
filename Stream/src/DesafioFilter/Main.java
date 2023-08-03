package DesafioFilter;
// Crie um Stream de produtos
// Filtre somente casos com desconto acima de 30%
// Filtre somente casos com frete grátis


import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",5000.99,0.4,0);
        Produto p2 = new Produto("Caderno",20.99,0.2,20);
        Produto p3 = new Produto("Copo",12,0.3,20);
        Produto p4 = new Produto("Casaco",499.99,0.5,30);
        Produto p5 = new Produto("Tablet",1899.99,0.27,0);
        Produto p6 = new Produto("Tapete",300,0.4,50);

        Stream<Produto> produtos = Stream.of(p1,p2,p3,p4,p5,p6);

        Consumer<String> println = System.out::println;
        Predicate<Produto> descontoAlto = x -> x.getDesconto() >= 0.3;
        Predicate<Produto> freteGratis = x -> x.getFrete() == 0;
        Function<Produto, String> toStringProduto = x -> x.getNome()
                + " -  $" + String.format("%.2f",x.getValor() - (x.getValor()) * x.getDesconto());

        System.out.println("Produtos com Desconto acima de 30%: ");
        produtos.filter(descontoAlto).map(toStringProduto).forEach(println);

        produtos = Stream.of(p1,p2,p3,p4,p5,p6);

        System.out.println("\nProdutos com Frete Grátis: ");
        produtos.filter(freteGratis).map(toStringProduto).forEach(println);
    }
}

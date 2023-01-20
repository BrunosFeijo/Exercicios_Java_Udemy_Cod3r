package POO_Composicao.UmPraMuitos;

public class Main {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem(new Item("Borracha", 12, 3.89));
        compra1.adicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println("Quantos itens tem na lista: " + compra1.itens.size());
        System.out.println("Valor total do carrinho: " + compra1.obterValorTotal());
    }
}

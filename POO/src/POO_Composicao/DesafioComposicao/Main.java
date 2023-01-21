package POO_Composicao.DesafioComposicao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        Item item1 = new Item(new Produto("Caneta", 7.00), 10);
        Item item2 = new Item(new Produto("Borracha", 3.00), 10);
        Item item3 = new Item(new Produto("Caderno", 18.90), 3);
        Item item4 = new Item(new Produto("Lápis", 2.00), 10);

        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);
        compra2.adicionarItem(item3);
        compra2.adicionarItem(item4);


        System.out.println("Valor total do carrinho: " + cliente.obterValorTotal());
    }
}

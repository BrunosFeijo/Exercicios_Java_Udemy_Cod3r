package POO_Composicao.DesafioCompra;

public class Item {
    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}

package POO_Composicao.DesafioComposicao;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            for (Item itens : compra.itens) {
                total += itens.quantidade * itens.produto.preco;
            }
        }
        return total;
    }
}

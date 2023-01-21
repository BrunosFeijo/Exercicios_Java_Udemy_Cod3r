package POO_Composicao.DesafioComposicao;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item) {
        this.itens.add(item);
    }
}

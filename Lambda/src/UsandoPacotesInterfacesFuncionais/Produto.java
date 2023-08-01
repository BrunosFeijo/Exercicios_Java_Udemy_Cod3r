package UsandoPacotesInterfacesFuncionais;

import java.text.DecimalFormat;

public class Produto {
    private final String nome;
    private final double preco;
    private final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal =  preco * (1 - desconto);
        return nome + ": R$" + String.format("%.2f",precoFinal);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}

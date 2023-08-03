package DesafioFilter;

public class Produto {
    private String nome;
    private double valor;
    private double desconto;
    private double frete;

    public Produto(String nome, double valor, double desconto, double frete) {
        this.setNome(nome);
        this.setValor(valor);
        this.setDesconto(desconto);
        this.setFrete(frete);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}

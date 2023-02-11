package Filas.Exercícios.E01;

public class Documento {
    private String nome;
    private int qtd;

    public Documento(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", qtd=" + qtd +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

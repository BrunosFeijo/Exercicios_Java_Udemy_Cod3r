package Enum_Como_Classe;

public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');

        Genero(char genero) {
        }
    }
    private String nome;
    private Genero genero;

    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}

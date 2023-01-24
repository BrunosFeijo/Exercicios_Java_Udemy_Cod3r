package POO.Encapsulamento.GettersAndSetters;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Nome: " +  getNome() + "\n" +
                "Sobrenome: " + getSobrenome() + "\n" +
                "Idade: " + getIdade();
    }
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
}

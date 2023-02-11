package Filas;

public class Paciente implements Comparable<Paciente>{
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Paciente novoPaciente) {
        // a < b  = -1
        // a > b  =  1
        // a == b =  0
        if (this.prioridade > novoPaciente.getPrioridade()){
            return 1;
        } else if (this.prioridade < novoPaciente.getPrioridade()) {
            return -1;
        }
        return 0;

        // Outra forma de comparar e dar o retorno.
        // return Integer.valueOf(this.prioridade).compareTo(novoPaciente.getPrioridade());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}

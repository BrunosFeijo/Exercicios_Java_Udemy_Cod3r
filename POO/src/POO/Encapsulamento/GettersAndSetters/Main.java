package POO.Encapsulamento.GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "Lima", -45);
        p1.setIdade(230); // não permite

        System.out.println(p1); // toString
        System.out.println();
        System.out.println("Nome completo: " + p1.getNomeCompleto());
    }
}

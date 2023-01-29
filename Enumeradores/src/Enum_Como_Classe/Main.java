package Enum_Como_Classe;

public class Main {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia + " - " + dia.getValor() + "\n");


        Data data = new Data(27, 01, 1994, dia);
        System.out.println(data + "\n");

        Formulario cadastro = new Formulario("Bruno", Formulario.Genero.MASCULINO);
        System.out.println(cadastro.getNome() + " - " + cadastro.getGenero());
    }
}


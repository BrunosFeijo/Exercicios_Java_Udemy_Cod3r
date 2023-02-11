package Filas;

public class TesteFilaPrioritaria {
    public static void main(String[] args) {
        FilaPrioritaria<Paciente> fila = new FilaPrioritaria<Paciente>();

        fila.enfileirar(new Paciente("A",2));
        fila.enfileirar(new Paciente("B",3));
        fila.enfileirar(new Paciente("C",1));

        System.out.println(fila); // 1 2 3

        System.out.println(fila.desenfileirar());

        System.out.println(fila);
    }
}

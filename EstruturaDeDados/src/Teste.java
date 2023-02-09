import Filas.Fila;

public class Teste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);

        System.out.println(fila);
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila);
    }
}

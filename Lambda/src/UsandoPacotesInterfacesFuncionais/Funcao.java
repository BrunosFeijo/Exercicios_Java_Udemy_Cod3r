package UsandoPacotesInterfacesFuncionais;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Ímpar";
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor -> valor + "???";

        System.out.println("1° Chamada...");
        System.out.println(parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32));

        System.out.println("\n2° Chamada...");
        System.out.println(parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(33));
    }
}

import java.util.function.Function;

public class Testes {
    public static void main (String args[]) {
        Function<Integer, String> parOuImpar = numero -> {
            System.out.println("Chamando Par ou Impar ");
            return numero % 2 == 0 ? "Par" : "Ímpar";
        };

        Function<String, String> oResultadoE = valor -> {
            String retorno = "O resultado é: " + valor;
            System.out.println("Chamando oResultadoE -> Parametro - " + valor + " -> Retorno - " + retorno);
            return retorno;
        };

        Function<String, String> empolgado = valor -> {
            String retorno = valor + "!!!";
            System.out.println("Chamando empolgado -> Parametro - " + valor + " -> Retorno - " + retorno);
            return retorno;
        };

        System.out.println("Chamada 1");
        parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println();

        System.out.println("Chamada 2");
        parOuImpar.andThen(empolgado).andThen(oResultadoE).apply(32);
    }
}

package UsandoPacotesInterfacesFuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBiFuncional {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> ((x + y) / 2);
        Function<Double, String> resultado = x -> x >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("Usando Composição...");
        System.out.println(media.andThen(resultado).apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultadoMedia =
                (x, y) -> ((x + y) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("\nUsando BiFuncional...");
        System.out.println(resultadoMedia.apply(9.5,4.0));

    }


}

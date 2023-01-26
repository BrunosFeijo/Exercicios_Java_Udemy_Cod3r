package UsandoPacotesInterfacesFuncionais.Desafio;
// 1. A partir do produto calcular o preço real (com desconto)
// 2. Imposto Municipal: >= 2500 (8,5) / < 2500 (Isento)
// 3. Frete: >= 3000 (100) / < 3000 (50)
// 4. Arredondar: 2 casa decimais
// 5. Formatar: R$xx,xx

import UsandoPacotesInterfacesFuncionais.Produto;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);
        DecimalFormat duasCasasDecimais = new DecimalFormat("##.##");

        BinaryOperator<Double> comDesconto = (x, y) -> x * (1 - y);
        UnaryOperator<Double> comImposto = x -> x >= 2500 ? x += (x * 0.085) : x;
        UnaryOperator<Double> comFrete = x -> x >= 3000 ? x + 100 : x + 50;
        Function<Double,String> formatar = x -> "R$" + duasCasasDecimais.format(x);

//        Outra possibilidade de formatar casas decimais
//        Double.parseDouble(String.format("%.2f", x));

        System.out.println(comDesconto
                .andThen(comImposto)
                .andThen(comFrete)
                .andThen(formatar)
                .apply(p.getPreco(),p.getDesconto()));

    }
}

package UsandoPacotesInterfacesFuncionais;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = Double::sum;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2,3));
    }
}

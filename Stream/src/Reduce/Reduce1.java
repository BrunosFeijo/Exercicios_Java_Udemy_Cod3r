package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> soma = (x, y) -> x + y;

        Integer total1 = nums.parallelStream().reduce(soma).get();  // reduce retorna Optional, portanto get()
        System.out.println(total1); //45

        // identity informa um valor inicial ao cálculo
        // se fosse parallelStream informaria o valor para todas as iterações do array
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2); // 145

        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println); // 30
    }
}

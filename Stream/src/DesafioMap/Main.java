package DesafioMap;
//1. Converter número do Array para binário ... 6 => "110"
//2. Inverter a string... "110" => "011"
//3. Converter de volta para inteiro... "011" => 3

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, String> binario = Integer::toBinaryString;
        UnaryOperator<String> inverter = Main::reverseString;
        Function<String, Integer> inteiro = x -> Integer.parseInt(x, 2);

        nums.stream()
                .map(binario)
                .map(inverter)
                .map(inteiro)
                .forEach(System.out::println);

    }

    public static String reverseString(String input) {
        StringBuilder teste = new StringBuilder(input);
        return teste.reverse().toString();
    }

}

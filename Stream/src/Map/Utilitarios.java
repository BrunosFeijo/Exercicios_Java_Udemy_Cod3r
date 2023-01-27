package Map;

import java.util.function.UnaryOperator;

public class Utilitarios {
    public static final UnaryOperator<String> maiuscula = String::toUpperCase;

    public static String grito(String x) {
        return x + "!!! ";
    }
}

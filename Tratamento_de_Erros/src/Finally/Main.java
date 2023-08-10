package Finally;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Este bloco sempre é executado. Mesmo quando houver erro.");
        }
        System.out.println("Fim");
    }
}

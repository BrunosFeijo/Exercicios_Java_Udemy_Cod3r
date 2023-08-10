package Checada_x_NaoChecada;

public class Main {
    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            gerarErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }

    // Exceção NÃO checada
    static void gerarErro1() {
        throw new RuntimeException(" #01 Ocorreu um erro RuntimeException ");
    }

    // Exceção checada
    static void gerarErro2() throws Exception {
        throw new Exception(" #02 Ocorreu um erro Exception ");
    }
}

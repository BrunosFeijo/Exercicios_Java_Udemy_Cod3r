package Strings;

public class Inicializacao {
    public static void main(String[] args) {
        String vazia = new String(); // ""
        System.out.println("Vazia: " + vazia);

        String nome = new String("Bruno");
        System.out.println("Nome: " + nome);

        String nomeDerivado = new String(nome);
        System.out.println("Nome instanciado com variável: " + nomeDerivado);

        char[] charNome = {'B','R','U','N','O'};
        String nomeChar = new String(charNome);
        System.out.println("Nome instanciado com variável de array de chars: " + nomeChar);

        String nomeChar2 = new String(charNome,0,3);
        System.out.println("Nome instanciado usando offset do array de chars: " + nomeChar2);

        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println("Nome informado por um array de bytes usando tabela asc: " + abcde);
    }
}

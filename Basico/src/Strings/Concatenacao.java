package Strings;

public class Concatenacao {
    public static void main(String[] args) {
        String curso = "Curso";
        String java = "Java";
        String cursoJava = curso + " " + java;
        System.out.println("Concatenação simples: " + cursoJava);

        // Para executar contas matemáticas em String deve se usar parênteses antes da concatenação
        String resultado = "Resultado de 2+2 = " + 2 + 2;
        String resultado2 = "Resultado de 2+2 = " + (2 + 2);
        System.out.println("Resultado de 2+2 =  + 2 + 2 => " + resultado);
        System.out.println("Resultado de 2+2 =  + (2 + 2) => " + resultado2);

        String um = String.valueOf(1);
        System.out.println("valuesOf faz a conversao do tipo para String: " + um);

        // Estas concatenações fazem o mesmo trabalho, porém gastam muito espaço em memória já que, uma String sendo imutável,
        // gera uma nova referência na memória a cada concatenação
        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
                "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(concatenacao);

        String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
        concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
        concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
        concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
        concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(concatenacao2);
    }
}

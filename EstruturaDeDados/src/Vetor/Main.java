package Vetor;

public class Main {
    public static void main(String[] args) {
        //Testando versão somente String
        

        System.out.println();
        //Testando versão com Object
        VetorGenericoUsandoObject v = new VetorGenericoUsandoObject(5);

        v.adiciona("Bruno");
        v.adiciona(1);
        v.adiciona(true);

        System.out.println(v.toString());
    }
}

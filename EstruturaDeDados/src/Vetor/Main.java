package Vetor;

public class Main {
    public static void main(String[] args) {
        //Testando versão somente String
        Vetor v = new Vetor(5);

        v.adiciona("Bruno");
        v.adiciona("1");
        v.adiciona("true");

        System.out.println(v);

        System.out.println();

        //Testando versão com Object
        VetorGenericoUsandoObject vObject = new VetorGenericoUsandoObject(5);

        vObject.adiciona("Bruno");
        vObject.adiciona(1);
        vObject.adiciona(true);

        System.out.println(vObject);


    }
}

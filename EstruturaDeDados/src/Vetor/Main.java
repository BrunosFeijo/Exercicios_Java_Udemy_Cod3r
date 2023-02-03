package Vetor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando versão somente String");
        Vetor v = new Vetor(3);

        v.adiciona("Bruno");
        v.adiciona("1");
        v.adiciona("true");
        v.adiciona("21");

        System.out.println(v);
        System.out.println("Localiza 'Bruno' -> index: " + v.busca("Bruno") + "\n" +
                "Remove este index e print novo array -> ");
        v.remove(v.busca("Bruno"));
        System.out.print(v + "\n");

        //v.remove(10); erro posição não encontrada
        //v.busca(-3); erro posição não encontrada

        System.out.println();

        /******************************************************/
        System.out.println("Testando versão com Object");
        VetorGenericoUsandoObject vObject = new VetorGenericoUsandoObject(3);

        vObject.adiciona("Bruno");
        vObject.adiciona(1);
        vObject.adiciona(true);
        vObject.adiciona("21");

        System.out.println(vObject);
        System.out.println("Localiza 'Bruno' -> index: " + vObject.busca("Bruno") + "\n" +
                "Remove este index e print novo array -> ");
        vObject.remove(vObject.busca("Bruno"));
        System.out.print(vObject + "\n");

        System.out.println();

        /*********************************************************/
        System.out.println("Testando versão com Generics (Lista)");
        Lista<Integer> vLista = new Lista<Integer>(3);

        vLista.adiciona(0);
        vLista.adiciona(1);
        vLista.adiciona(2);
        vLista.adiciona(1,3);

        System.out.println(vLista);
        System.out.println("Localiza '3' -> index: " + vLista.buscaElemento(3) + "\n" +
                "Remove este index e print novo array -> ");
        vLista.remove(vLista.buscaElemento(3));
        System.out.print(vLista + "\n");


    }
}

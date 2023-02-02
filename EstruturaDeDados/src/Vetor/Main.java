package Vetor;

public class Main {
    public static void main(String[] args) {
        VetorGenericoUsandoObject v[] = new VetorGenericoUsandoObject[5];

        v[0].adiciona("Bruno");
        v[1].adiciona(1);
        v[2].adiciona(2);

        System.out.println(v.toString());
    }
}

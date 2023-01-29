public class Main {
    public static void main(String[] args) {
        usandoConstantes();
        System.out.println();
        usandoEnum();
    }

    private static void usandoConstantes() {
        DiaSemanaConstantes dia = new DiaSemanaConstantes();

        System.out.println("***Usando constantes***");
        imprimeDiaSemana(dia);
    }

    private static void imprimeDiaSemana(DiaSemanaConstantes dia) {
        System.out.println(dia.SEGUNDA);
        System.out.println(dia.TERCA);
        System.out.println(dia.QUARTA);
        System.out.println(dia.QUINTA);
        System.out.println(dia.SEXTA);
        System.out.println(dia.SABADO);
        System.out.println(dia.DOMINGO);
    }

    private static void usandoEnum() {
        DiaSemana dia = DiaSemana.DOMINGO;
        imprimeDiaSemana(dia);
    }

    private static void imprimeDiaSemana(DiaSemana dia) {

    }

}


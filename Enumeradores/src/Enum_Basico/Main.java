package Enum_Basico;

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
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("***Usando Enum***");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

}


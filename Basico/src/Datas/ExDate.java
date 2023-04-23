package Datas;

import java.util.Calendar;
import java.util.Date;

public class ExDate {
    public static void main(String[] args) {
        Date hoje = new Date();
        Date nascimento = new Date(1994, 1, 27);

        System.out.println(hoje);

        System.out.println("Milisegundos desde 01/01/1970: " + hoje.getTime());
        System.out.println("Milisegundos desde 01/01/1970: " + nascimento.getTime());

        System.out.println(hoje.getDate());
        System.out.println("Dia do mês: " + hoje.getDate());

        long diferenca = hoje.getTime() - nascimento.getTime();
        double anos = diferenca / (365 * 24 * 60 * 60 * 1000);
        long idade = Math.round(anos);

        System.out.println("Idade: " + idade); // errado
    }
}

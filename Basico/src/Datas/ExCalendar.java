package Datas;

import java.util.Calendar;

public class ExCalendar {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(1994, 3, 22);

        if (hoje.get(Calendar.DAY_OF_YEAR) >= dataNascimento.get(Calendar.DAY_OF_YEAR)) {
            System.out.println(hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));
        } else {
            System.out.println(hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR) - 1);
        }

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d \n",
                dia, (mes +1) , ano, hora , minuto, segundo);

        hoje.add(Calendar.DAY_OF_MONTH,-1); // adiciona -1 dia
        hoje.add(Calendar.DAY_OF_MONTH,6); // adiciona 6 dias (cumulativo)

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}

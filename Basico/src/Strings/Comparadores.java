package Strings;

public class Comparadores {
    public static void main(String[] args) {
        String nome = "Bruno";
        String nome2 = "BRUNO";
        String nome3 = "Bruno";
        String nome4 = new String(nome);

        System.out.println("nome equals nome2 = " + nome.equals(nome2)); // false
        System.out.println("nome equals nome3 = " + nome.equals(nome3) + "\n"); // true

        System.out.println("nome equalsIgnoreCase nome2 = " + nome.equalsIgnoreCase(nome2) + "\n"); // true

        System.out.println("nome == nome2 = " + (nome == nome2)); // false
        System.out.println("nome == nome3 = " + (nome == nome3)); // true
        System.out.println("nome == nome4 = " + (nome == nome4) + "\n"); // false

        System.out.println("nome equals nome4 = " + nome.equals(nome4)); // true
        System.out.println("nome equalsIgnoreCase nome4 = " + nome.equalsIgnoreCase(nome4)); // true

        System.out.println("\nComparar partes de texto:");

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println("bANAna x ANA => " + banana.regionMatches(1,ana,0,3)); // true
        System.out.println("baNAna x aNA => " + banana.regionMatches(2,ana,1,2)); // true
        System.out.println("BANana x BAN => " + banana.regionMatches(true,0,ban,0,3)); // true

        System.out.println("Comparando o inicio da palabra => " + banana.startsWith(ban)); // true
        System.out.println("Comparando o final da palabra => " + banana.endsWith(ana)); /// true

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        // compareTO
         // -1 = a > b
         //  0 = a == b
         //  1 || > 1 = a < b
        System.out.println("-1 = a > b   ==> " + a.compareTo(b));
        System.out.println(" 0 = (a == b)==>  " + a.compareTo("a"));
        System.out.println(">=1 = a < b  ==>  " + b.compareTo(a));
        System.out.println(">=1 = a < b  ==> " + a.compareTo(aMaiusculo));

    }
}

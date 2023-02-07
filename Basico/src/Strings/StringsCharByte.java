package Strings;

import java.util.Arrays;

public class StringsCharByte {
    public static void main(String[] args) {
        String texto = "Bruno";

        for (int i =0;i < texto.length();i++){
            System.out.print(texto.charAt(i));
        }

        System.out.println();
        char text[] = new char[4];
        texto.getChars(0,4,text,0);
        System.out.println(text);

        byte textoByte[] = new byte[4];
        texto.getBytes(0, 4, textoByte, 0);
        System.out.println(Arrays.toString(textoByte));

        char textoChar[] = texto.toCharArray();
        System.out.println(textoChar);
    }
}

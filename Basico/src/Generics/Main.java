package Generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Object
        CaixaObject caixaObject = new CaixaObject("Olá"); // qualquer objeto
        String coisa = (String) caixaObject.abrir();// porém é necessário fazer o casting
        System.out.println(coisa);

        //Generics
        CaixaGenerica<Character> caixaGenerica = new CaixaGenerica<>('x'); // qualquer objeto
        System.out.println(caixaGenerica.abrir());
        // Herança
        CaixaInt caixaInt = new CaixaInt(123); // apenas inteiros
        System.out.println(caixaInt.abrir()); // 123

        CaixaNumero<Double> caixaNumero = new CaixaNumero<>(2.3); // apenas números
        System.out.println(caixaNumero.abrir()); // 2.3

        //Exemplos com listas
        List<String> langs = Arrays.asList("Python", "Java", "C++", "PHP");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        //Usando Object é necessário fazer o casting
        String ultimaLinguagem = (String) ListaUtil.getUltimoObject(langs);
        System.out.println(ultimaLinguagem);
        // Usando Genercis
        Integer ultimoNumero = ListaUtil.getUltimoGenerico(nums);
        System.out.println(ultimoNumero);

        //Lista com dois atributos genéricos (chave-valor)
        ListaChaveValor<Integer, String> listaChaveValor = new ListaChaveValor<>();
        listaChaveValor.adicionar(1,"Maria");
        listaChaveValor.adicionar(2,"Pedro");
        listaChaveValor.adicionar(3,"Gui");
        listaChaveValor.adicionar(4,"Ana");
        listaChaveValor.adicionar(2,"Edu");

        System.out.println("1 - " + listaChaveValor.getValor(1));
        System.out.println("2 - " + listaChaveValor.getValor(2));
        System.out.println("3 - " + listaChaveValor.getValor(3));
        System.out.println("4 - " + listaChaveValor.getValor(4));
    }
}

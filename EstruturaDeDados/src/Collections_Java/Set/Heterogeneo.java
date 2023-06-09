package Collections_Java.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Heterogeneo {
    public static void main(String[] args) {
        HashSet<java.io.Serializable> conjunto = new HashSet<>();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Charactere

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste"); // Não é igual a "Teste"
        conjunto.add('x'); // Objeto já foi adicionado, então será ignorado
        System.out.println("Agora tamanho é " + conjunto.size());

        System.out.println("'teste' foi removido? " + conjunto.remove("teste"));
        System.out.println("'Teste' foi removido? " + conjunto.remove("Teste"));
        System.out.println("'x' foi removido? " + conjunto.remove('x'));

        System.out.println("Agora tamanho é " + conjunto.size());

        System.out.println("'x' existe no conjunto? " + conjunto.contains('x'));
        System.out.println("'1' existe no conjunto? " + conjunto.contains(1));
        System.out.println("'true' existe no conjunto? " + conjunto.contains(true));

        Set nums = new TreeSet(); // Set ordenado

        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(3);

        System.out.println("Conjunto ordenado " + nums);
        System.out.println("Conjunto desordenado " + conjunto);

        System.out.println("União entre dois conjuntos");
        conjunto.addAll(nums);
        System.out.println(conjunto);


        Set conjuntoAdicional = new HashSet<>(); // para intersecção precisam ser do mesmo tipo "Hashset"
        conjuntoAdicional.add(2);
        conjuntoAdicional.add(1);
        conjuntoAdicional.add(4);
        conjuntoAdicional.add(3);

        System.out.println("Intersecção entre dois conjuntos: ");
        conjunto.retainAll(conjuntoAdicional);
        System.out.println(conjunto);


    }
}

import java.util.Arrays;
import java.util.List;

public class Testes {
    public static void main (String args[]) {

        // cria um array de strings
        String a[] = new String[]{"abc","def","fhi","jkl"};

        List list1 = Arrays.asList(a);

        // imprime a lista
        System.out.println("A lista é:" + list1);
    }
}

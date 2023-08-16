package Generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimoObject(List<?> lista){
        return lista.get(lista.size() - 1);
    }
    public static <T> T getUltimoGenerico(List<T> lista){
        return lista.get(lista.size() - 1);
    }
}

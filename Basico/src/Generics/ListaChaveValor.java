package Generics;

import java.util.Set;
import java.util.TreeSet;

public class ListaChaveValor<C extends Number, V> {
    private final Set<ChaveValor<C,V>> itens = new TreeSet<>();


}

package Generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("ALL")
public class ListaChaveValor<C extends Number, V> {
    private final Set<ChaveValor<C,V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave,V valor){
        if(chave == null) return;

        ChaveValor<C,V> novaChave = new ChaveValor<>(chave, valor);

        if (itens.contains(novaChave)) itens.remove(novaChave); // explicito
        itens.add(novaChave);
    }
    public V getValor(C chave){
        if(chave == null) return null;

        Optional<ChaveValor<C,V>> chaveValorOptional = itens.stream().filter(chave::equals).findAny();

        return chaveValorOptional.isPresent() ? chaveValorOptional.get().getValor() : null;
    }
}

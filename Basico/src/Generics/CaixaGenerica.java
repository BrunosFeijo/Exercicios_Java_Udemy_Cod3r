package Generics;

public class CaixaGenerica<T> {
    private T coisa;

    public CaixaGenerica(T coisa) {
        this.coisa = coisa;
    }
    public T abrir(){
        return coisa;
    }
}

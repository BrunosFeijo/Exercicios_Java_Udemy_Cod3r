package Generics;

public class CaixaNumero<N extends Number> extends CaixaGenerica<N>{
    public CaixaNumero(N coisa) {
        super(coisa);
    }
}

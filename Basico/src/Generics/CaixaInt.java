package Generics;
// Generics pode ser passado por herança
public class CaixaInt extends CaixaGenerica<Integer> {

    public CaixaInt(Integer coisa) {
        super(coisa);
    }
}

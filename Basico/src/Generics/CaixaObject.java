package Generics;

public class CaixaObject {
    private Object coisa;

    public CaixaObject(Object coisa) {
        this.coisa = coisa;
    }

    public void guardar(Object coisa){
        this.coisa = coisa;
    }
    public Object abrir(){
        return coisa;
    }
}

package POO.Interface;

public class Carro {
    double velocidade = 0;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidade + getDelta() <= VELOCIDADE_MAXIMA){
            velocidade += getDelta();
        }else {
            velocidade = VELOCIDADE_MAXIMA;
        }
    }
    void frear(){
        if (velocidade - getDelta() >= 0){
            velocidade -= getDelta();
        }else{
            velocidade = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }


}

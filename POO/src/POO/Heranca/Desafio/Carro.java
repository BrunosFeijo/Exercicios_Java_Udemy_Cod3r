package POO.Heranca.Desafio;

public class Carro {
    double velocidade = 0;
    final int VELOCIDADE_MAXIMA;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidade + delta <= VELOCIDADE_MAXIMA){
            velocidade += delta;
        }else {
            velocidade = VELOCIDADE_MAXIMA;
        }
    }
    void frear(){
        if (velocidade - delta >= 0){
            velocidade -= delta;
        }else{
            velocidade = 0;
        }
    }
}

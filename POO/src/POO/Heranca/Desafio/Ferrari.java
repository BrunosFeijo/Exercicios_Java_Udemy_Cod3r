package POO.Heranca.Desafio;

public class Ferrari extends Carro{
    int delta = 15;
    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    @Override
    void acelerar() {
        if (velocidade + delta <= VELOCIDADE_MAXIMA){
            velocidade += delta;
        }else {
            velocidade = VELOCIDADE_MAXIMA;
        }
    }
    @Override
    void frear() {
        if (velocidade - delta >= 0){
            velocidade -= delta;
        }else{
            velocidade = 0;
        }
    }
}

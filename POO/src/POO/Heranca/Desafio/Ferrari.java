package POO.Heranca.Desafio;

public class Ferrari extends Carro{
    @Override
    void acelerar() {
        if (velocidade < 250){
            velocidade += 10;
        }
    }
    @Override
    void frear() {
        super.frear();
        super.frear();
    }
}

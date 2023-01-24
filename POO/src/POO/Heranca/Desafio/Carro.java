package POO.Heranca.Desafio;

public class Carro {
    double velocidade = 0;

    void acelerar(){
        if (velocidade < 150){
            velocidade += 5;
        }
    }
    void frear(){
        if (velocidade > 0){
            velocidade -= 5;
        }
    }
}

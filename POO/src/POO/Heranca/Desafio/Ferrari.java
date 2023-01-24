package POO.Heranca.Desafio;

public class Ferrari extends Carro{
    int delta = 15;
    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        super.delta = this.delta;
    }
}

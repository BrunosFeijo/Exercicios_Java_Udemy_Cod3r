package POO.Heranca.Desafio;
//Parte 1
//Criar uma classe carro, uma de civic (que estende carro) e uma de ferrari (que estende carro).
//Definir um atributo velocidade
//Definir dois métodos (acelerar e frear)
//A ferrari deve acelerar mais rápido

//Parte 2
//Crie um contrutor que receba a velocidade máxima por parâmetro na superclasse
public class Main {
    public static void main(String[] args) {
        Carro civic = new Civic(150);
        Carro ferrari = new Ferrari(250);

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println("Velocidade do Civic: " + civic.velocidade);
        System.out.println("Velocidade da Ferrar: " + ferrari.velocidade);
        System.out.println();

        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();

        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();

        System.out.println("Velocidade do Civic: " + civic.velocidade);
        System.out.println("Velocidade da Ferrar: " + ferrari.velocidade);
    }
}

package Interface;

public class Main {
    public static void main(String[] args) {
        Carro civic = new Civic(150);
        Ferrari ferrari = new Ferrari(250);
        ferrari.ligarTurbo();
        ferrari.desligarAr();

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

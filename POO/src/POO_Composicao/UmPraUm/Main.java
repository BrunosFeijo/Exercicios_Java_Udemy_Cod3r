package POO_Composicao.UmPraUm;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Motor está ligado?  " + c1.estaLigado());

        c1.ligar();
        System.out.println("E agora?   " + c1.estaLigado());

        System.out.println("Quantos giros: " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Quantos giros: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear(); // ignorado
        System.out.println("Quantos giros: " + c1.motor.giros());

        //Faltou Encapsulamento!!!
        //c1.motor.fatorInjecao = -30;

        //Relação Bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
    }
}

package POO.Heranca;

public class Main {
    public static void main(String[] args) {
        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

        Heroi j2 = new Heroi();
        j2.x = 12;
        j2.y = 12;

        j1.andar(Direcao.SUL);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.LESTE);
        System.out.println("(" + j1.x + "," + j1.y + ")");
        System.out.println("(" + j2.x + "," + j2.y + ")");

        j1.atacar(j2);
        j2.atacar(j1);
        j2.atacar(j1);
        System.out.println("Monstro' Life: " + j1.vida);
        System.out.println("Heroi' Life: " + j2.vida);

    }
}

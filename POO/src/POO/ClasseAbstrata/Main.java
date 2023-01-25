package POO.ClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println("Como se move? " + cachorro.mover());
        System.out.println("Tem pelos? " + cachorro.pelos());
        System.out.println("Como respira? " + cachorro.respirar());
    }
}

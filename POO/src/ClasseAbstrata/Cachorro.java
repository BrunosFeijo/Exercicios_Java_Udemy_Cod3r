package ClasseAbstrata;

public class Cachorro extends Mamífero{
    @Override
    String mover() {
        return "Usando as patas";
    }

    @Override
    boolean pelos() {
        return true;
    }
}

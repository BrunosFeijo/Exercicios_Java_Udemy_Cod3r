package POO.Polimorfirmo.Dinâmico;

public class Comida {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }
    }

    public Comida(double peso) {
        setPeso(peso);
    }
}

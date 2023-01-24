package POO.Polimorfirmo.Estático;

public class Arroz {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Arroz(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }
}

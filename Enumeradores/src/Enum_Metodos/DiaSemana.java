package Enum_Metodos;

public enum DiaSemana {
    SEGUNDA(2), TERCA(3), QUARTA(4),
    QUINTA(5), SEXTA(6), SABADO(7), DOMINGO(1);
    private final int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

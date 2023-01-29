package Enum_Como_Classe;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public Data() {
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d - %s", dia, mes, ano, diaSemana);
    }

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}

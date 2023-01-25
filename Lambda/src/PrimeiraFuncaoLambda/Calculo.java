package PrimeiraFuncaoLambda;
@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    //Ainda é possível crir um método default
    //Também é possível criar um método static
}

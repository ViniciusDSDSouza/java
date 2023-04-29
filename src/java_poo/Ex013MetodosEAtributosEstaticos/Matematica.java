package java_poo.Ex013MetodosEAtributosEstaticos;

public class Matematica {
    private static double pi = 3.14;

    public static double somar(double numeroA, double numeroB) {
        return (numeroA + numeroB);
    }

    public static double calcularAreaQuadrado(double lado) {
        return (lado * lado);
    }

    public static double calcularAreaCiruclo(double raio) {
        return (pi * raio * raio);
    }

    public static double getPi() {
        return pi;
    }
}
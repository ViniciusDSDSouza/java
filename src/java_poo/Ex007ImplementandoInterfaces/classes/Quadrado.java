package java_poo.Ex007ImplementandoInterfaces.classes;

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        System.out.println(Math.pow(lado, 2));
    }
}

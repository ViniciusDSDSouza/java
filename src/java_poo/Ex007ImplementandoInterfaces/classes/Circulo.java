package java_poo.Ex007ImplementandoInterfaces.classes;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        System.out.println(Math.PI * (Math.pow(raio, 2)));
    }
    
}

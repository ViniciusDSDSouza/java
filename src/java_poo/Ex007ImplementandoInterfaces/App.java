package java_poo.Ex007ImplementandoInterfaces;

import java_poo.Ex007ImplementandoInterfaces.classes.*;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        quadrado.calcularArea();

        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
    }
}

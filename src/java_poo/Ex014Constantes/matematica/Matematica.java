package java_poo.Ex014Constantes.matematica;

public class Matematica {
    public static double calcularAreaCirculo(double raio) {
        double area = MatematicaConstantes.PI * raio * raio;
        System.out.printf("O raio é igual a %.4f\n", area);
        return area;
    }
}

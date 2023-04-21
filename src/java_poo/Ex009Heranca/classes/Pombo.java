package java_poo.Ex009Heranca.classes;

public class Pombo extends Ave{
    private int cartasEnviadas = 0;

    
    public Pombo(String nome) {
        super(nome);
    }
    
    public void fazerPru() {
        System.out.printf("%s fez pruuuuhh\n", getNome());
    }
    
    public void enviarCarta() {
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
    }
    
    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}

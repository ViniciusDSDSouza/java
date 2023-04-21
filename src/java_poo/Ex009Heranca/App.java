package java_poo.Ex009Heranca;

import java_poo.Ex009Heranca.classes.*;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.latir();
        cachorro.lamber();
        System.out.println("");

        Gato gato = new Gato("José Carlos");
        gato.miar();
        System.out.println("");

        Dragao dragao = new Dragao("Banguela");
        dragao.cuspirFogo();
        System.out.println("");

        Pombo pombo = new Pombo("Pombinha");
        pombo.fazerPru();
        pombo.enviarCarta();
        System.out.printf("%s enviou %s carta(s)",pombo.getNome(),pombo.getCartasEnviadas());
    }    
}

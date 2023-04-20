package java_poo.Ex007ImplementandoInterfaces02;

import java_poo.Ex007ImplementandoInterfaces02.classes.*;
import java_poo.Ex007ImplementandoInterfaces02.classes.jogos.*;

public class App {
    public static void main(String[] args) {
        Videogame playDevOne = new Videogame();
        
        Jogo xadrez = new Xadrez();
        Jogo pingPong = new PingPong();
        Jogo tiroAoAlvoOnline = new TiroAoAlvoOnline();

        playDevOne.ligarVideogame();

        playDevOne.abrirJogo(xadrez);
        playDevOne.fecharJogo();

        playDevOne.abrirJogo(pingPong);
        playDevOne.fecharJogo();

        playDevOne.abrirJogo(tiroAoAlvoOnline);
        playDevOne.fecharJogo();
    }
}

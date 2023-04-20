package java_poo.Ex007ImplementandoInterfaces02.classes.jogos;

import java_poo.Ex007ImplementandoInterfaces02.classes.Jogo;

public class PingPong implements Jogo{
    public void iniciar() {
        System.out.println("Iniciando PingPong");
    }

    public void encerrar() {
        System.out.println("Encerrando PingPong");
    }

}

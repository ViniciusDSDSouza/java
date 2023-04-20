package java_poo.Ex007ImplementandoInterfaces02.classes.jogos;

import java_poo.Ex007ImplementandoInterfaces02.classes.Jogo;

public class Xadrez implements Jogo{
    public void iniciar() {
        System.out.println("Iniciando Xadrez");
    }

    public void encerrar() {
        System.out.println("Encerrando Xadrez");
    }

}

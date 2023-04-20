package java_poo.Ex007ImplementandoInterfaces02.classes.jogos;

import java_poo.Ex007ImplementandoInterfaces02.classes.*;

public class TiroAoAlvoOnline implements Jogo{

    public void iniciar() {
        System.out.println("Iniciando Tiro ao Alvo!\nConectando-se ao servidor...\nConectado!");
    }

    public void encerrar() {
        System.out.println("Salvando progresso...\nEncerrando Tiro ao Alvo!");
    }
    
}

package java_poo.Ex010Heranca02;

import java_poo.Ex010Heranca02.classes.*;

public class App {
    public static void main(String[] args) {
        //Serie serie1 = new Serie("The Last of Us", 1, 2023);
        // Mesma coisa que colocar:
        //System.out.println(serie1.toString());
        //System.out.println(serie1);

        Personagem personagem = new Personagem("Jãozinho");
        System.out.println(personagem);
        personagem.atacar();

        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);
        arqueiro.setArma("Arco Raro");
        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }   
}
package java_poo.Ex015BatalhaPokemon2.Classes;

import javax.swing.JOptionPane;

import java_poo.Ex015BatalhaPokemon2.Classes.Pokemon.*;

public class Batalha {
    Bulbasaur bulbasaur;
    Charmander charmander;
    Squirtle squirtle;
    Ratata ratata;

    public Batalha(Bulbasaur bulbasaur, Ratata ratata) {
        ratataSelvagem(ratata);
        this.bulbasaur = bulbasaur;
        while(true) {
            bulbasaur.atacar(ratata);
            ratata.vidaAtual();
            if(ratata.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "Ratata Selvagem foi derrotado!");
                break;
            }
            ratata.atacar(bulbasaur);
            bulbasaur.vidaAtual();
            if(bulbasaur.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, bulbasaur.getNome() + " foi derrotado!");
                break;
            }
        }
    }

    public Batalha (Charmander charmander, Ratata ratata) {
        ratataSelvagem(ratata);
        this.charmander = charmander;
        while(true) {
            charmander.atacar(ratata);
            ratata.vidaAtual();
            if(ratata.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "Ratata Selvagem foi derrotado!");
                break;
            }
            ratata.atacar(charmander);
            charmander.vidaAtual();
            if(charmander.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, charmander.getNome() + " foi derrotado!");
                break;
            }
        }
    }

    public Batalha (Squirtle squirtle, Ratata ratata) {
        ratataSelvagem(ratata);
        this.squirtle = squirtle;
        while(true) {
            squirtle.atacar(ratata);
            ratata.vidaAtual();
            if(ratata.getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "Ratata selvagem foi derrotado!");
                break;
            }
            ratata.atacar(squirtle);
            squirtle.vidaAtual();
            if(squirtle.getVida() <= 0) {
                JOptionPane.showConfirmDialog(null, squirtle.getNome() + " foi derrotado!");
            }
        }
    }

    public void ratataSelvagem(Ratata ratata) {
        JOptionPane.showMessageDialog(null,"Um " + ratata.getNome() + " selvagem apareceu!\nVida: " + ratata.getVida());
        this.ratata = ratata;
    }
}

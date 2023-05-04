package java_poo.Ex015BatalhaPokemon2.Classes.Pokemon;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ratata extends Pokemon{
    private Random golpeRatata = new Random();

    public Ratata() {
        super("Ratata");
        setStatusBase();
    }

    private void setStatusBase(){
        setVida(100);
        setForca(35);
        setNivel(2);
    }

    private void scrath() {
        setDano(10);
        JOptionPane.showMessageDialog(null, getNome() + " usou Scrath!\nCausou " + getDano() + " de dano!");
    }

    private void bite() {
        setDano(20);
        JOptionPane.showMessageDialog(null, getNome() + " usou Bite!\nCausou " + getDano() + " de dano!");
    }

    public void atacar(Bulbasaur bulbasaur) {
        setGolpe(golpeRatata.nextInt(2));
        switch(getGolpe()) {
            case 0:
                scrath();
                causarDano(bulbasaur);
                break;
            case 1:
                bite();
                causarDano(bulbasaur);
                break;
        }
    }

    public void atacar(Charmander charmander) {
        setGolpe(golpeRatata.nextInt(2));
        switch(getGolpe()) {
            case 0:
                scrath();
                causarDano(charmander);
                break;
            case 1:
                bite();
                causarDano(charmander);
                break;
        }
    }

    public void atacar(Squirtle squirtle) {
        setGolpe(golpeRatata.nextInt(2));
        switch(getGolpe()) {
            case 0:
                scrath();
                causarDano(squirtle);
                break;
            case 1:
                bite();
                causarDano(squirtle);
                break;
        }
    }

    private void causarDano(Bulbasaur bulbasaur) {
        bulbasaur.setVida(bulbasaur.getVida() - getDano());
        if (bulbasaur.getVida() < 0) {
            bulbasaur.zerarVida();
        }
    }

    private void causarDano(Charmander charmander) {
        charmander.setVida(charmander.getVida() - getDano());
        if (charmander.getVida() < 0) {
            charmander.zerarVida();
        }
    }

    private void causarDano(Squirtle squirtle) {
        squirtle.setVida(squirtle.getVida() - getDano());
        if (squirtle.getVida() < 0) {
            squirtle.zerarVida();
        }
    }
}
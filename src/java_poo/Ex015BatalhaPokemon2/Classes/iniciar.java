package java_poo.Ex015BatalhaPokemon2.Classes;

import javax.swing.JOptionPane;

import java_poo.Ex015BatalhaPokemon2.Classes.Pokemon.*;

public class iniciar {
    private static String[] iniciais = {"Bulbasaur", "Charmander", "Squirtle"};
    private static int pokemonEscolhido;
    private static Batalha batalha;
    private static Ratata ratata;

    public static void inicial() {
        ratata = new Ratata();
        pokemonEscolhido = JOptionPane.showOptionDialog(null, "Escolha seu primeiro Pokemon!",null,JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,iniciais,iniciais);
        switch (pokemonEscolhido) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu Bulbasaur!");
                Bulbasaur bulbasaur = new Bulbasaur();
                batalha = new Batalha(bulbasaur, ratata);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu Charmander!");
                Charmander charmander = new Charmander();
                batalha = new Batalha(charmander, ratata);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu Squirtle!");
                Squirtle squirtle = new Squirtle();
                batalha = new Batalha(squirtle, ratata);
        }
    }
}
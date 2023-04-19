package java_poo.Ex003BatalhaPokemon;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {  
        PokemonInicial charmander = new PokemonInicial();
        PokemonInicial bulbassauro = new PokemonInicial();
        PokemonInicial squirtle = new PokemonInicial();

        charmander.nome = "Charmander";
        bulbassauro.nome = "Bulbassauro";
        squirtle.nome = "Squirtle";

        String inicial = escolherInicial();
        System.out.println(inicial);
        mensagem(inicial);
    }

    public static String escolherInicial(){
        int inicialNumero = JOptionPane.showOptionDialog(null, "Escolha o seu Pokémon inicial:", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Charmander", "Bulbassauro", "Squirtle"}, 0);

        if (inicialNumero == 0) {
            return "Charmander";
        } else if (inicialNumero == 1) {
            return "Bulbassauro";
        }else {
            return "Squirtle";
        }
    }

    public static void mensagem(String pokemon){
        JOptionPane.showMessageDialog(null, "Você escolheu " + pokemon + "!");
    }
}
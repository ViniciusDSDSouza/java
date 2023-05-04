package java_poo.Ex015BatalhaPokemon2.Classes.Pokemon;

import javax.swing.JOptionPane;

public class Bulbasaur extends Pokemon {
    private String[]golpes = {"Tackle", "Vine Whipe"};

    public Bulbasaur(String nome) {
        super(nome);
        setStatusBase();
    }

    public Bulbasaur() {
        super("Bulbasaur");
        setStatusBase();
    }

    private void setStatusBase(){
        setVida(45);
        setForca(49);
        setNivel(5);
    }

    private void tackle() {
        setDano(40);
        JOptionPane.showMessageDialog(null, getNome() + " usou Takle!\nCausou " + getDano() + " de dano!");
    }

    private void vineWhip() {
        setDano(55);
        JOptionPane.showMessageDialog(null, getNome() + " usou Vine Whip!\nCausou " + getDano() + " de dano!");
    }

    public void atacar(Ratata ratata) {
        setGolpe(JOptionPane.showOptionDialog(null, "O que fazer agora?",null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, golpes, golpes));
        switch(getGolpe()) {
            case 0:
                tackle();
                causarDano(ratata);
                break;
            case 1:
                vineWhip();
                causarDano(ratata);
                break;
        }
    }
}
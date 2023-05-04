package java_poo.Ex015BatalhaPokemon2.Classes.Pokemon;

import javax.swing.JOptionPane;

public class Charmander extends Pokemon{
    private String[] golpes = {"Scratch", "Ember"};

    public Charmander(String nome) {
        super(nome);
        setStatusBase();
    }

    public Charmander() {
        super("Charmander");
        setStatusBase();
    }

    private void setStatusBase(){
        setVida(41);
        setForca(52);
        setNivel(5);
    }

    private void scrath() {
        setDano(40);
        JOptionPane.showMessageDialog(null, getNome() + " usou Scrath!\nCausou " + getDano() + " de dano!");
    }

    private void ember() {
        setDano(60);
        JOptionPane.showMessageDialog(null, getNome() + " usou Ember!\nCausou " + getDano() + " de dano!");
    }

    public void atacar(Ratata ratata) {
        setGolpe(JOptionPane.showOptionDialog(null, "O que fazer agora?",null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, golpes, golpes));
        switch(getGolpe()) {
            case 0:
                scrath();
                causarDano(ratata);
                break;
            case 1:
                ember();
                causarDano(ratata);
                break;
        }
    }
}
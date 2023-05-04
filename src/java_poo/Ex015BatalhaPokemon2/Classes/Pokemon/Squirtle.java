package java_poo.Ex015BatalhaPokemon2.Classes.Pokemon;

import javax.swing.JOptionPane;

public class Squirtle extends Pokemon{
    private String[] golpes = {"Tackle","Water Gun"};

    public Squirtle(String nome) {
        super(nome);
        setStatusBase();
    }

    public Squirtle() {
        super("Squirtle");
        setStatusBase();
    }

    private void setStatusBase(){
        setVida(44);
        setForca(48);
        setNivel(5);
    }

    private void tackle() {
        setDano(40);
        JOptionPane.showMessageDialog(null, getNome() + " usou Takle!\nCausou " + getDano() + " de dano!");
    }

    private void waterGun() {
        setDano(55);
        JOptionPane.showMessageDialog(null, getNome() + " usou Water Gun!\nCausou " + getDano() + " de dano!");
    }

    public void atacar(Ratata ratata) {
        setGolpe(JOptionPane.showOptionDialog(null, "O que fazer agora?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, golpes, golpes));
        switch(getGolpe()) {
            case 0:
                tackle();
                causarDano(ratata);
                break;
            case 1:
                waterGun();
                causarDano(ratata);
                break;
        }
    }
}

package java_poo.Ex015BatalhaPokemon2.Classes.Pokemon;

import javax.swing.JOptionPane;

public class Pokemon {
    private String nome;
    private int vida,forca,nivel,dano,golpe;
    
    protected Pokemon(String nome) {
        this.nome = nome;
    }

    public void vidaAtual() {
        JOptionPane.showMessageDialog(null,getNome() + " possui " + getVida() + " pontos de vida");
    }

    public void causarDano(Ratata ratata) {
        ratata.setVida(ratata.getVida() - getDano());
        if (ratata.getVida() < 0) {
            ratata.zerarVida();
        }
    }

    public void zerarVida() {
        setVida(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }
}
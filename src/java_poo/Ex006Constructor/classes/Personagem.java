package java_poo.Ex006Constructor.classes;

import javax.swing.JOptionPane;

public class Personagem {
    String nome,classe;
    int nivel,forca,vida;


    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.forca = nivel*2;
        this.vida = nivel*10;
    }

    public void mostrarStatus(){
        String status = String.format("Nome: %s\nClasse: %s\nNivel: %d\nForça: %d\nVida: %d",nome,classe,nivel,forca,vida);
        JOptionPane.showMessageDialog(null, status);
    }
}

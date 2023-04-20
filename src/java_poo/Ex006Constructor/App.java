package java_poo.Ex006Constructor;

import javax.swing.JOptionPane;

import java_poo.Ex006Constructor.classes.*;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João",47,1.90f);
        pessoa.dadosPessoais();

        String nome = JOptionPane.showInputDialog(null, "Nome do Personagem: ", "Criação de personagem:", JOptionPane.QUESTION_MESSAGE);
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem: ", "Criação de Personagem", JOptionPane.QUESTION_MESSAGE);

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}
package java_poo.Ex012RelacionamentoEAgregacao.classes;

import java.util.ArrayList;

public class ListaContatos {

    // Variáveis
    private ArrayList<Contato> contatos;

    // Constructor
    public ListaContatos() {
        this.contatos = new ArrayList<Contato>(); 
    }

    // Metodos Próprios
    public void adicionar(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato) {
        contatos.add(novoContato);
    }

    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao += contato + "\n";
        }
        return informacao;
    }

    // Getters e Setters
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
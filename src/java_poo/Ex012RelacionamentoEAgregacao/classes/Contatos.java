package java_poo.Ex012RelacionamentoEAgregacao.classes;

import java.util.ArrayList;

public class Contatos {
    ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }
    public void adicionar(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }
    public void adicionar(Contato novoContato) {
        contatos.add(novoContato);
    }
    public Contatos buscar(String palavraChave) {
        String palavraChaveMinuscula = palavraChave.toLowerCase();
        Contatos contatosFiltrados = new Contatos();
        for (Contato contato : contatos) {
            String nomeContato = contato.getNome().toLowerCase();
            if(nomeContato.contains(palavraChaveMinuscula)) {
                contatosFiltrados.adicionar(contato);
            }
        }
        return contatosFiltrados;
    }
    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao += contato + "\n";
        }
        return informacao;
    }
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
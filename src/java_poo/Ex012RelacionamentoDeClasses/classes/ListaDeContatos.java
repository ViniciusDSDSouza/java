package java_poo.Ex012RelacionamentoDeClasses.classes;

import java.util.ArrayList;

public class ListaDeContatos {
    private ArrayList<Contato> listaDeContatos;

    public ListaDeContatos () {
        this.listaDeContatos = new ArrayList<Contato>();
    }
    public void adicionar(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        listaDeContatos.add(contato);
    }
    public void adicionar(Contato contato) {
        listaDeContatos.add(contato);
    }
    public ListaDeContatos buscar(String palavraChave) {
        System.out.println("Contatos Filtrados:");
        palavraChave = palavraChave.toLowerCase();
        ListaDeContatos contatosFiltrados = new ListaDeContatos();
        for (int c = 0; c < listaDeContatos.size();c++) {
            String nomeContato = listaDeContatos.get(c).getNome();
            nomeContato = nomeContato.toLowerCase();
            if(nomeContato.contains(palavraChave)) {
                contatosFiltrados.adicionar(listaDeContatos.get(c));
            }
        }
        return contatosFiltrados;
    }
    @Override
    public String toString() {
        String lista = "Contatos:\n";
        for (int c = 0; c < listaDeContatos.size(); c++) {
            lista += listaDeContatos.get(c) + "\n";
        }
        return lista;
    }
    public ArrayList<Contato> getListaDeContatos() {
        return listaDeContatos;
    }
}
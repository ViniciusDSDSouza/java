package java_poo.Ex012RelacionamentoDeClasses.classes;

import java.util.ArrayList;

public class ListaDeContatos {
    ArrayList<Contato> listaDeContatos;

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

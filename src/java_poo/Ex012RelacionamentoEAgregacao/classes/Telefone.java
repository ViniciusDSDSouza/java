package java_poo.Ex012RelacionamentoEAgregacao.classes;

public class Telefone {

    // Variáveis
    private String numeroChip;
    private ListaContatos listaDeContatos;

    // Constructor
    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        this.listaDeContatos = new ListaContatos();
    }

    // Getters e Setters
    public String getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(String numeroChip) {
        this.numeroChip = numeroChip;
    }

    public ListaContatos getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ListaContatos listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }
}
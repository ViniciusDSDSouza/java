package java_poo.Ex012RelacionamentoDeClasses.classes;

public class Telefone {
    private String chipTelefone;
    private ListaDeContatos listaDeContatos;
    private Ligacoes ligacoes;

    public Telefone (String chipTelefone) {
        this.chipTelefone = chipTelefone;
        listaDeContatos = new ListaDeContatos();
        ligacoes = new Ligacoes();
    }
    public void adicionar(Contato contato){
        listaDeContatos.adicionar(contato);
    }
    public void adicionar(String nome, String numero) {
        listaDeContatos.adicionar(nome, numero);
    }
    public void ligar(Contato contato){
        getLigacoes().ligar(contato);
    }
    public void ligar(String numero) {
        getLigacoes().ligar(numero);
    }
    public String getChipTelefone() {
        return chipTelefone;
    }
    public ListaDeContatos getListaDeContatos() {
        return listaDeContatos;
    }
    public Ligacoes getLigacoes() {
        return ligacoes;
    }
}
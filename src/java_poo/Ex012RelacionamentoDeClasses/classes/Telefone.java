package java_poo.Ex012RelacionamentoDeClasses.classes;

public class Telefone {
    private String chipTelefone;
    private ListaDeContatos listaDeContatos;
    private ListaDeLigacoes listaDeLigacoes;

    public Telefone (String chipTelefone) {
        this.chipTelefone = chipTelefone;
        this.listaDeContatos = new ListaDeContatos();
        this.listaDeLigacoes = new ListaDeLigacoes();
    }
    public void adicionar(Contato contato){
        listaDeContatos.adicionar(contato);
    }
    public void adicionar(String nome, String numero) {
        listaDeContatos.adicionar(nome, numero);
    }
    public void ligar(String numero) {
        Ligacao ligacao = new Ligacao(chipTelefone, numero);
        ligacao.ligar();
        listaDeLigacoes.adicionar(ligacao);
    }
    public void ligar(Contato contato) {
        this.ligar(contato.getNumero());
    }
    public String getChipTelefone() {
        String meuNumero = String.format("Seu número é: %s",chipTelefone);
        return meuNumero;
    }
    public ListaDeContatos getListaDeContatos() {
        return listaDeContatos;
    }
    public ListaDeLigacoes getListaDeLigacoes() {
        return listaDeLigacoes;
    }
}
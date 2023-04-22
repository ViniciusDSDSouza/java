package java_poo.Ex012RelacionamentoEAgregacao.classes;

public class Telefone extends Ligacao{
    private String numeroChip;
    private Contatos contatos;
    private Chamadas chamadas;

    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        this.contatos = new Contatos();
        this.chamadas = new Chamadas();
    }
    public String getNumeroChip() {
        return numeroChip;
    }
    public Contatos getContatos() {
        return contatos;
    }
    public Chamadas getChamadas() {
        return chamadas;
    }
}
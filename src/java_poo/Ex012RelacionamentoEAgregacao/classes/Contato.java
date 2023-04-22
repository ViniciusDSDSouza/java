package java_poo.Ex012RelacionamentoEAgregacao.classes;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public String toString() {
        String texto = String.format("Nome: %s \tNúmero: %s",nome,numero);
        return texto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
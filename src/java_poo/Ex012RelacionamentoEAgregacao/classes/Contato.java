package java_poo.Ex012RelacionamentoEAgregacao.classes;

public class Contato {

    // Variáveis
    private String nome;
    private String numero;

    // Constructor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Métodos Próprios
    @Override
    public String toString() {
        String informacaoDeContato = String.format("Nome: %s \tNúmero: %s", nome, numero);
        return informacaoDeContato;
    }

    // Getters e Setters
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
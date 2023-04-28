package java_poo.Ex012RelacionamentoDeClasses.classes;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s \tNúmero: %s",nome,numero);
    }
    public String getNome(){
        return nome;
    }
    public String getNumero() {
        return numero;
    }
}
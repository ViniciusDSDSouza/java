package java_poo.Ex012RelacionamentoDeClasses.classes;

public class Contato {
    String nome;
    String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s \tNúmero: %s",nome,numero);
    }
}

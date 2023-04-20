package java_poo.Ex006Constructor.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    
    // Método Constructor
    public Pessoa (String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void dadosPessoais(){
        System.out.printf("Nome: %s, idade %d, Altura: %.2fm", nome,idade,altura);
    }
}

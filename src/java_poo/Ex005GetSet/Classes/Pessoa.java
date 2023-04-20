package java_poo.Ex005GetSet.Classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void frase() {
        System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f\n",nome,idade,altura);
    }
}
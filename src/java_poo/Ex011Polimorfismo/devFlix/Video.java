package java_poo.Ex011Polimorfismo.devFlix;

public class Video {

    private String nome;

    public Video(String nome) {
        this.nome =  nome;
    }

    public void play() {
        System.out.printf("Iniciando o video: %s\n",nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
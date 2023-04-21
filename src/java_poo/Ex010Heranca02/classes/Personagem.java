package java_poo.Ex010Heranca02.classes;

public class Personagem {

    private String nome;
    private String classe;
    private int nivel;

    // Constructor
    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (Nível: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }

    // Metodos próprios
    public void atacar(){
        System.out.printf("%s atacou usando soco!\n",getNome());
    }

    public final void atacarSemArma(){
        System.out.printf("%s atacou usando soco!\n",getNome());
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

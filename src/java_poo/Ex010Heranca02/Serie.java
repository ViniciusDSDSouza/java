package java_poo.Ex010Heranca02;

public class Serie {
    
    private String nome;
    private int temporadas, ano;

    // Constructor
    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    // Metodos específicos da classe
    // Sobrescrever o metodo toString() --> @Override --> significa uma sobrescrita de metodo
    @Override
    public String toString() {
        String getInformacoes = String.format("Nome: %s (%d), %d Temporada", nome, ano,temporadas);
        return getInformacoes;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

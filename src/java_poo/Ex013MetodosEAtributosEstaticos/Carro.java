package java_poo.Ex013MetodosEAtributosEstaticos;

public class Carro {
    private String nome;
    private int ano;
    public static int rodas = 0; 
    
    public Carro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRodas() {
        return rodas;
    }
}

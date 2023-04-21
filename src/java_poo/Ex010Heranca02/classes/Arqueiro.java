package java_poo.Ex010Heranca02.classes;

public final class Arqueiro extends Personagem{

    String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        this.arma = "Arco Comum";
    }

    @Override
    public String toString() {
        String infoArqueiro = super.toString() + " - Arma: " + arma;
        return infoArqueiro;
    }

    @Override
    public void atacar() {
        System.out.printf("%s atacou usando %s!", getNome(), arma);
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
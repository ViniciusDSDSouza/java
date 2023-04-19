package java_poo.Ex002;

public class App {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem();

        heroi1.nome = "Hércules";
        heroi1.nivel = 5;
        heroi1.forca = 2;
        heroi1.vida = 10;
        heroi1.velocidade = 2;
        heroi1.habilidade = "Porrada";

        Inimigo inimigo = new Inimigo();

        inimigo.nome = "Serpente";
        inimigo.vida = 10;

        heroi1.mostrarStatus();
        heroi1.atacar(inimigo.nome, heroi1.habilidade);
        inimigo.danoRecebido(heroi1.forca);

        System.out.printf("\n\nO inimigo está com %d de vida", inimigo.vida);
    }
}

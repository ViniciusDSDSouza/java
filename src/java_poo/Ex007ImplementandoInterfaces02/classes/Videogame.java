package java_poo.Ex007ImplementandoInterfaces02.classes;

public class Videogame {
    boolean isLigado, rodandoJogo;
    Jogo jogo;

    public void ligarVideogame(){
        isLigado = true;
        System.out.println("Ligando videogame!");
    }

    public void abrirJogo(Jogo jogo){
        if (isLigado == true) {
            rodandoJogo = true;
            this.jogo = jogo;
            jogo.iniciar();
        } else {
            System.out.println("Ligue o videogame antes de inicar!");
        }
    }

    public void fecharJogo() {
        if (rodandoJogo == true) {
            jogo.encerrar();
            rodandoJogo = false;
        } else {
            System.out.println("Não é possível fechar jogo! Nenhum jogo rodando!");
        }
    }
}

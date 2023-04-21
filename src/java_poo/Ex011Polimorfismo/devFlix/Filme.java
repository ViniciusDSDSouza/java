package java_poo.Ex011Polimorfismo.devFlix;

public class Filme extends Video{

    private String audio,legenda;
    private String iniciando = "Iniciando o filme: %s\n";

    public Filme (String nome) {
        super(nome);
        this.audio = "Português";
        this.legenda = "Nenhuma";
    }

    @Override
    public void play() {
        System.out.printf(iniciando,toString());
    }

    public void play(String audio) {
        this.audio = audio;
        System.out.printf(iniciando,toString());
    }

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.printf(iniciando,toString());
    }
    
    @Override
    public String toString() {
        String informacao = String.format("%s (Áudio: %s - Legenda: %s)", getNome(), audio, legenda);
        return informacao;
    }
}
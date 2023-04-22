package java_poo.Ex012RelacionamentoEAgregacao.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numeroOrigem, numeroDestino, horarioLigacao;
    private DateTimeFormatter formatarData;
    private Chamadas chamadas;

    public void ligar(String numeroDestino) {
        this.numeroDestino = numeroDestino;
        mensagemLigar();
        chamadas.adicionar(null);
    }
    public void ligar(Contato contato) {
        this.numeroDestino = contato.getNumero();
        System.out.printf("Ligando para %s\n",contato.getNome());
        mensagemLigar();
    }
    private void mensagemLigar() {
        System.out.printf("Ligando para %s\n",this.numeroDestino);
        System.out.println("Chamando...");
        System.out.println("O número está ocupado");
        formatarData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        System.out.println(getHorarioLigacao());
    }
    public String getNumeroOrigem() {
        return numeroOrigem;
    }
    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }
    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
    public String getHorarioLigacao() { 
        LocalDateTime horarioLigacao = LocalDateTime.now();
        return formatarData.format(horarioLigacao);
    }
}
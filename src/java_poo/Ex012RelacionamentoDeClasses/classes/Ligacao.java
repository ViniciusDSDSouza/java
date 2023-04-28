package java_poo.Ex012RelacionamentoDeClasses.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }
    public Ligacao(String numeroOrigem, Contato numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino.getNumero();
    }
    public void ligar() {
        System.out.printf("Ligando para %s\nChamando...\nNúmero ocupado\n\n",numeroDestino);
        horarioAtual();
    }
    private void horarioAtual() {
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        horarioLigacao = formatadorData.format(LocalDateTime.now());
    }
    @Override
    public String toString() {
        return String.format("Origem: %s \tDestino: %s \tHorário: %s\n", numeroOrigem, numeroDestino, horarioLigacao);
        
    }
    public String getHorarioLigacao() {
        return horarioLigacao;
    }
}

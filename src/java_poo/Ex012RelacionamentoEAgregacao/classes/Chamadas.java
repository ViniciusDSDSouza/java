package java_poo.Ex012RelacionamentoEAgregacao.classes;

import java.util.ArrayList;

public class Chamadas {
    ArrayList<Ligacao> ligacoes;

    public Chamadas() {
        this.ligacoes = new ArrayList<Ligacao>();
    }

    public void adicionar(Ligacao ligacao) {
        ligacoes.add(ligacao);
    }

    @Override
    public String toString() {
        String informacao = "Chamadas:\n";
        for (Ligacao ligacao : ligacoes) {
            informacao += ligacao + "\n";
        }
        return informacao;
    }
}

package java_poo.Ex012RelacionamentoDeClasses.classes;

import java.util.ArrayList;

public class ListaDeLigacoes {
    private ArrayList<Ligacao> listaDeLigacoes;

    public ListaDeLigacoes() {
        this.listaDeLigacoes = new ArrayList<Ligacao>();
    }
    public void adicionar(Ligacao ligacao) {
        listaDeLigacoes.add(ligacao);
    }
    @Override
    public String toString() {
        String mensagem = "Histórico de ligações:\n";
        for (Ligacao ligacao : listaDeLigacoes) {
            mensagem += ligacao;
        }
        return mensagem;
    }
}

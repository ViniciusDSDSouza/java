package java_poo.Ex012RelacionamentoDeClasses;

import java_poo.Ex012RelacionamentoDeClasses.classes.*;

public class App {
    public static void main(String[] args) {
        Telefone celular = new Telefone("4002 8922");
        ListaDeContatos listaContatos = celular.getListaDeContatos();
        ListaDeLigacoes listaLigacoes = celular.getListaDeLigacoes();

        Contato contatoA = new Contato("Paulo", "9999 9999");
        Contato contatoB = new Contato("Lucas", "8888 8888");

        celular.adicionar(contatoA);
        celular.adicionar(contatoB);
        celular.adicionar("Maria", "7777 7777");

        System.out.println(listaContatos);
        System.out.println(listaContatos.buscar("L"));
        
        celular.ligar(contatoA);
        celular.ligar(contatoB);
        celular.ligar("7777 7777");

        System.out.println(listaLigacoes);
    }
}
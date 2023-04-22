package java_poo.Ex012RelacionamentoDeClasses;

import java_poo.Ex012RelacionamentoDeClasses.classes.*;

public class App {
    public static void main(String[] args) {
        Telefone celular = new Telefone("4002 8922");

        Contato contato = new Contato("Pedro", "9999 9999");
        Contato contato2 = new Contato("Lucas", "8888 8888");

        celular.adicionar(contato);
        celular.adicionar(contato2);
        celular.adicionar("Maria", "7777 7777");

        System.out.println(celular.getListaDeContatos());
        celular.getLigacoes().ligar(contato2);

        celular.ligar("6666 6666");
    }
}
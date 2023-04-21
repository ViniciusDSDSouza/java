package java_poo.Ex012RelacionamentoEAgregacao;

import java_poo.Ex012RelacionamentoEAgregacao.classes.*;

public class App {
    public static void main(String[] args) {

        Telefone celular = new Telefone("4002 8922");
        Contato contato1 = new Contato("Cleitinho", "28491234");
        Contato contato2 = new Contato("Robertinho", "43145735");
        Contato contato3 = new Contato("Marquinho", "74524213");

        celular.getListaDeContatos().adicionar(contato1);
        celular.getListaDeContatos().adicionar(contato2);
        celular.getListaDeContatos().adicionar(contato3);

        System.out.println(celular.getListaDeContatos());
    }
}
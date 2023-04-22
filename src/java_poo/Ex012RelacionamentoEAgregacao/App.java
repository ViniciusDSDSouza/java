package java_poo.Ex012RelacionamentoEAgregacao;

import java_poo.Ex012RelacionamentoEAgregacao.classes.*;

public class App {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002 8922");
        telefone.getContatos().adicionar("Luan","50531583");
        telefone.getContatos().adicionar("Joao","75252563");
        telefone.getContatos().adicionar("Lucas","14737457");
        Contato maria = new Contato("Maria","57893582");
        telefone.getContatos().adicionar(maria);

        System.out.println(telefone.getContatos().toString());
        System.out.println(telefone.getContatos().buscar("l"));

        telefone.ligar("41904546");
        System.out.println("");
        telefone.ligar(maria);
    }
}
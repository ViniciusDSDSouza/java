package java_poo.Ex005GetSet;

import java_poo.Ex005GetSet.Classes.Conta;
import java_poo.Ex005GetSet.Classes.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.getNome();
        pessoa.getIdade();
        pessoa.getAltura();
        pessoa.frase();

        pessoa.setNome("Vinicius");
        pessoa.setIdade(17);
        pessoa.setAltura(1.65f);
        pessoa.frase();

        Conta conta = new Conta();

        conta.depositar(450.40);
        conta.getSaldo();
        conta.retirar(34);
        conta.getSaldo();
    }
}
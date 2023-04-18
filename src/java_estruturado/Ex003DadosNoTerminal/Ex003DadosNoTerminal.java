package Ex003DadosNoTerminal;

import java.util.Scanner;

public class Ex003DadosNoTerminal{
    public static void main(String[] args) {

        // Variável do tipo Scanner
        Scanner texto = new Scanner (System.in);

        System.out.println("Qual o seu nome?");

        // Digitando o Valor e atribuindo a uma variável
        String nome = texto.nextLine();

        System.out.println(nome + ", foi um prazer te conhecer!");
        texto.close();
    }
}
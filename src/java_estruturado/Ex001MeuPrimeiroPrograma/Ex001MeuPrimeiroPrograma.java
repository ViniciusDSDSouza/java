package Ex001MeuPrimeiroPrograma;

public class Ex001MeuPrimeiroPrograma {
    public static void main(String[] args) {
        String nome = "Vinicius";
        int idade = 17;
        float dinheiro = 7.45f;
        char generoAbreviado = 'm';
        String genero = null;
        boolean maioridade;

        if (idade >= 18) {
            maioridade = true;
        } else {
            maioridade = false;
        }

        if (generoAbreviado == 'm') {
            genero = "Masculino";
        } else if (generoAbreviado == 'f') {
            genero = "Feminino";
        } else {
            genero = null;
        }

        System.out.println("Olá " + nome + "!");
        System.out.println("Você possui " + idade + " anos de idade!");

        if(maioridade == true) {
            System.out.println("Você é maior de idade!");
        }else if (maioridade == false) {
            System.out.println("Você é menor de idade!");
        }

        System.out.println("Seu genero é " + genero + "!");
        System.out.println("Você possui R$" + dinheiro + " reais");
    }
}
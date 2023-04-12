import java.util.Scanner;

public class Ex004Operadores {
    public static void main(String[] args) {

        double n1,n2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine();

        System.out.println("Escolha um número: ");
        n1 = scan.nextDouble();

        System.out.println("Escolha outro número: ");
        n2 = scan.nextDouble();

        mensagem(nome);

        soma(n1,n2);
        subtracao(n1, n2);
        multiplicacao(n1, n2);
        divisao(n1, n2);

        scan.close();
    }

    static void soma(double  n1, double n2) {
        double somaRes = n1 + n2;
        String txt = n1 + " + " + n2 + " = ";

        // Retirar .00 dos números inteiros
        if (somaRes - (int)somaRes != 0) {
            System.out.println(txt + somaRes);
        } else if (somaRes - (int)somaRes == 0) {
            System.out.println(txt + (int)somaRes);
        }
    }

    static void subtracao(double n1, double n2){
        double subtracaoRes = n1 - n2;
        String txt = n1 + " - " + n2 + " = ";

        if (subtracaoRes - (int)subtracaoRes != 0) {
            System.out.println(txt + subtracaoRes);
        } else if (subtracaoRes - (int)subtracaoRes == 0) {
            System.out.println(txt + (int)subtracaoRes);
        }
    }

    static void multiplicacao (double n1, double n2) {
        double multiplicacaoRes = n1 * n2;
        String txt = n1 + " * " + n2 + " = ";
        
        if (multiplicacaoRes - (int)multiplicacaoRes != 0) {
            System.out.println(txt + multiplicacaoRes);
        } else if (multiplicacaoRes - (int)multiplicacaoRes == 0) {
            System.out.println(txt + (int)multiplicacaoRes);
        }
    }

    static void divisao(double n1, double n2) {
        double divisaoRes = n1 / n2;
        String txt = n1 + " / " + n2 + " = ";
        
        if (divisaoRes - (int)divisaoRes != 0) {
            System.out.println(txt + divisaoRes);
        } else if (divisaoRes - (int)divisaoRes == 0) {
            System.out.println(txt + (int)divisaoRes);
        }
    }

    static void mensagem(String nome){
        String frase = "Olá [nome], aqui estão os resultados:\n";
        System.out.println(frase.replace("[nome]", nome));
    }
}

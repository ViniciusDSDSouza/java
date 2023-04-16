package Ex005EstruturaDeRepeticoes;

import java.util.Random;
import java.util.Scanner;

public class Ex005EstruturaDeRepeticoes {
    public static void main(String[] args) {

        /*loopWhile();
        loopDo();
        loopFor();*/
        geradorDeInteirosAleatorios();

    }     

    static void loopWhile(){
        int w = 1;
        while(w <= 10){
            System.out.println("w = " + w);
            w++;
      }
    }

    static void loopDo(){
        int d = 1;
        do {
            System.out.println("d = " +d);
            d++;
        }while(d <=10);
    }

    static void loopFor(){
        for(int f = 1; f <= 10; f++) {
            System.out.println("f = " + f);
        }  
    }

    static void geradorDeInteirosAleatorios() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gerar números de 0 até:");
        int numerosGerados = scanner.nextInt();
        System.out.println("Quantos números você deseja gerar? ");
        int numero = scanner.nextInt();

        for (int c = 1; c <= numero; c++) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(numerosGerados);
            System.out.println(c + "° número: " + numeroAleatorio);
        }
        scanner.close();

    }
}
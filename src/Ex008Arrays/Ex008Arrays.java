package Ex008Arrays;

import javax.swing.JOptionPane;

class Ex008Arrays {
    public static void main(String[] args) {
        nomes();
        numeros();
        filmes();
    }

    public static void nomes() {
        String[] nomes =  {
            "Vinicius", "Lucas", "Pedro", "Victor", "Rafael"
        };

        System.out.println("Os nomes são: ");

        for (int c = 0; c < nomes.length; c++) {
            System.out.println(c+1 + "° - " + nomes[c]);
        }
    }

    public static void numeros() {
        int[] numeros = {
            12, 42, 51, 19
        };

        for(int c = 0; c < numeros.length; c++) {
            System.out.println(c+1 + "° número: " + numeros[c]);
        }
    }
    
    public static void filmes() {
        String[] listaDeFilmes = {
            "Vingadores", "Matrix", "Harry Potter", "Missão Impossível", "Sair"
        };

        int opcao = 0;

        while (opcao != 4) {
            opcao = JOptionPane.showOptionDialog(null,"Escolha oq assistir:", "Filmes: ", 0,JOptionPane.QUESTION_MESSAGE,null, listaDeFilmes,0);

            if (opcao != 4) {
                    JOptionPane.showMessageDialog(null, "Você assistiu: " + listaDeFilmes[opcao]);
            }
        }
    }
}
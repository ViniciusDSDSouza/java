public class Ex004Operadores {
    public static void main(String[] args) {

        double a = 5;
        double b = 10;
        String txt = a + " operador " + b + " = ";

        double soma = a + b;
        double subtracao = a - b;
        double divisao = a / b;
        double multiplicacao = a * b;

        System.out.println(txt.replace("operador","+") + soma);

        System.out.println(txt.replace("operador", "-") + subtracao);

        System.out.println(txt.replace("operador","/") + divisao);

        System.out.println(txt.replace("operador","*") + multiplicacao);

        String frase = "Olá nome, tudo bem com você?";
        String nome = "Vinicius";
        System.out.println("\n" + frase);
        System.out.println(frase.replace("nome",nome));
    }
}

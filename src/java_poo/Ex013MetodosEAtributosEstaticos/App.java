package java_poo.Ex013MetodosEAtributosEstaticos;

public class App {
    private static int numeroGlobal = 2;
    
    private static void imprimirMensagem() {
        System.out.println("Mensagem Global");
    }

    public static void main(String[] args) {
        System.out.println(numeroGlobal);

        imprimirMensagem();

        System.out.println(Matematica.somar(5.4, 10));
        System.out.println(Matematica.calcularAreaQuadrado(4.5));
        System.out.println(Matematica.calcularAreaCiruclo(9));
        System.out.println(Matematica.getPi());

        Carro ferrari = new Carro("Ferrari", 2023);
        Carro fusca = new Carro("Fusca", 1999);

        //ferrari.rodas = 2; --> Muda o fusca também, por "int rodas" ser um atributo estático
        Carro.rodas = 2;
        Carro.rodas = 4;

        System.out.println(ferrari.getNome());
        System.out.println(ferrari.getAno());
        System.out.println(ferrari.getRodas() + " Rodas");

        System.out.println(fusca.getNome());
        System.out.println(fusca.getAno());
        System.out.println(fusca.getRodas() + " Rodas");

        System.out.println(Jogo.areaJogador(numeroGlobal));
    }
}
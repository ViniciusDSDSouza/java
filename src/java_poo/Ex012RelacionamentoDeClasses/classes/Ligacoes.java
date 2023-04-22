package java_poo.Ex012RelacionamentoDeClasses.classes;

public class Ligacoes {
    
    public void ligar(Contato contato) {
        System.out.printf("Ligando para %s\n", contato);
        System.out.println("Telefone Ocupado");
    }
    public void ligar(String numero) {
        System.out.printf("Ligando para %s\n",numero);
        System.out.println("Telefone Ocupado");
    }
}
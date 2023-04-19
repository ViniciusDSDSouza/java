package java_poo.Ex001;

public class App {
    public static void main(String[] args) {
        // Declarando um objeto do tipo Celular chamado iphone
        Celular iphone = new Celular();
        iphone.nome = "Iphone 12";
        iphone.tamanhoTela = 6.2f ;
        iphone.espacoArmazenamento = 256;
        iphone.sistemaOperacional = "iOs";

        // Declarando um objeto do tipo Celular chamado xiaomi
        Celular xiaomi = new Celular();
        xiaomi.nome = "Redmi Note 11s";
        xiaomi.tamanhoTela = 6.43f;
        xiaomi.espacoArmazenamento = 128;
        xiaomi.sistemaOperacional = "Android 11";

        // Declarando um objeto do tipo Celular chamado samsung
        Celular samsung = new Celular();
        samsung.nome = "Samsung Galaxy S23";
        samsung.tamanhoTela = 6.1f;
        samsung.espacoArmazenamento = 512;
        samsung.sistemaOperacional = "Android 13";

        
        System.out.printf("Celular: %s \nTamanho da Tela: %.1f' \nEspaço de Armazenamento: %dgb \nSistema Operacional: %s", iphone.nome, iphone.tamanhoTela, iphone.espacoArmazenamento, iphone.sistemaOperacional);

        System.out.println("\n");

        System.out.printf("Celular: %s \nTamanho da Tela: %.2f' \nEspaço de Armazenamento: %dgb \nSistema Operacional: %s",xiaomi.nome, xiaomi.tamanhoTela, xiaomi.espacoArmazenamento, xiaomi.sistemaOperacional);

        System.out.println("\n");

        System.out.printf("Celular: %s \nTamanho da Tela: %.1f' \nEspaço de Armazenamento: %dgb \nSistema Operacional: %s", samsung.nome, samsung.tamanhoTela, samsung.espacoArmazenamento, samsung.sistemaOperacional);
    }
}
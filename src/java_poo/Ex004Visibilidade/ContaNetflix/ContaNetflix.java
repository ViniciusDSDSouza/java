package java_poo.Ex004Visibilidade.ContaNetflix;

public class ContaNetflix {
    private String idioma, resolucaoTela;

    public void entrar() {
        buscarIdioma();
        buscarResolucao();
    }

    public void assistirFilme(String nomeFilme) {
        if (idioma != null || resolucaoTela != null) {
            System.out.printf("Carregando o filme na resolução %s!\n", resolucaoTela);
            carregarAudio();
            System.out.printf("Iniciando o filme %s!\n", nomeFilme);
        } else {
            System.out.println("[erro] entre antes de assistir o filme! \nTente: conta.entrar(); ");
        }
    }

    private void buscarIdioma() {
        idioma = "PT-BR";
    }

    private void buscarResolucao() {
        resolucaoTela = "Full-Hd";
    }

    private void carregarAudio() {
        if(idioma == "PT-BR" || idioma == "EN-US" || idioma == "ES-GT") {
            System.out.printf("Carregando o áudio em %s!\n", idioma);
        } else {
            System.out.println("Carregando o áudio em EN-US!\n");
        }
    }
}

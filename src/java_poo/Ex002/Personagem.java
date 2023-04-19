package java_poo.Ex002;

public class Personagem {
    String nome, habilidade;
    int nivel,forca,vida,velocidade;

    void mostrarStatus(){
        System.out.printf("Nome: %s \nNível: %d \nForça: %d \nDefesa: %d \nVelocidade: %d \n", nome, nivel, forca, vida, velocidade);
    }

    void atacar(String alvo, String habilidade){

        if (habilidade.length() == 0) {
            System.out.printf("%s Atacou %s! Causou %d de dano!", nome, alvo, forca);
        } else {
            System.out.printf("%s usou %s contra %s! Causou %d de dano!", nome, habilidade, alvo, forca);
        }
    }
}

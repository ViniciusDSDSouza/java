package java_poo.Ex002;

public class Inimigo {
    String nome;
    int vida;

    void danoRecebido(int danoRecebido){
        vida -= danoRecebido;
    }
}

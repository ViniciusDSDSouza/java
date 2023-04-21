package java_poo.Ex009Heranca.classes;

public class Animal {
    
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
        comer();
        beber();
    }

    public void comer(){
        System.out.printf("%s comeu\n",nome);
    }
    
    public void beber(){
        System.out.printf("%s bebeu\n",nome);
    }

    public String getNome() {
        return nome;
    }
}
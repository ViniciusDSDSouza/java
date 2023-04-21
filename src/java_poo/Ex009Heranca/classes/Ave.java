package java_poo.Ex009Heranca.classes;

public class Ave extends Animal{
    public Ave(String nome) {
        super(nome);
        voar();
    }

    public void voar(){
        System.out.printf("%s voou\n",getNome());
    }
}

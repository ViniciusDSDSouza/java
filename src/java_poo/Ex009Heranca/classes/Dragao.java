package java_poo.Ex009Heranca.classes;

public class Dragao extends Ave {

    public Dragao(String nome) {
        super(nome);
    }

    public void cuspirFogo(){
        System.out.printf("%s cuspiu fogo\n",getNome());
    }
}

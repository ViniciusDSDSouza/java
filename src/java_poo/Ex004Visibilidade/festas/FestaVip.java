package java_poo.Ex004Visibilidade.festas;

public class FestaVip {
    private int quantidadeCafe = 50;
    private int quantidadeSalgados = 100;

    private void beberCafe(int xicaras) {
        if (xicaras == 0) {
            System.out.println("Você não bebeu café!");
        } else if (xicaras == 1) {
            System.out.printf("Você bebeu %d xícara de café!\n",xicaras);
        } else {
            System.out.printf("Você bebeu %d xícaras de café\n",xicaras);
        }
        quantidadeCafe = quantidadeCafe - xicaras;

        System.out.printf("Restam %d xícaras de café!\n",quantidadeCafe);
    }

    private void comerSalgado(int salgados) {
        if (salgados == 0){
            System.out.println("Você não comeu salgado!");
        } else if (salgados == 1) {
            System.out.printf("Você comeu apenas %d salgado\n", salgados);
        } else {
            System.out.printf("Você comeu %d salgados!\n", salgados);
        }
        quantidadeSalgados = quantidadeSalgados - salgados;
        System.out.printf("Restam %d salgados!\n", quantidadeSalgados);
    }

    public void cafeFesta(int xicaras){
        beberCafe(xicaras);
    }

    public void salgadoFesta(int salgados) {
        comerSalgado(salgados);
    }
}
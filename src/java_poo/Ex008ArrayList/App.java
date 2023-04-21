package java_poo.Ex008ArrayList;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String [] arrayEstatico = {
            "Alexandre","Vinicius","Jaime","João","Lucas"
        };
        mostrarArrayEstatico(arrayEstatico);
        System.out.println("");

        // Criando um array dinâmico com ArrayList
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Alexandre");
        arrayDinamico.add("Vinicius");
        arrayDinamico.add("Jaime");
        arrayDinamico.add("João");
        arrayDinamico.add("Lucas");
        mostrarArrayList(arrayDinamico);

        System.out.println("\nRemovendo João:");
        arrayDinamico.remove(3);
        mostrarArrayList(arrayDinamico);
        
        System.out.println("\nRemovendo todos: ");
        arrayDinamico.clear();
        mostrarArrayList(arrayDinamico);
    }

    static void mostrarArrayList(ArrayList<String> array){
        for(int c = 0; c < array.size(); c++){
            System.out.println(array.get(c));
        }
    }

    static void mostrarArrayEstatico(String[] array) {
        for(int c = 0; c < array.length; c++) {
            System.out.println(array[c]);
        }
    }
}
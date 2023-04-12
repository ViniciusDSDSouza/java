public class Ex005EstruturaDeRepeticoes {
    public static void main(String[] args) {

        int w = 1;
        while(w <= 10){
            System.out.println("w = " + w);
            w++;
        }

        int d = 1;
        do {
            System.out.println("d = " +d);
            d++;
        }while(d <=10);

        for(int f = 1; f <= 10; f++) {
            System.out.println("f = " + f);
        }       
    }
}
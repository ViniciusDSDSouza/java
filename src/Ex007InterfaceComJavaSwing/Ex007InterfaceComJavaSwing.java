package Ex007InterfaceComJavaSwing;

import javax.swing.JOptionPane;

public class Ex007InterfaceComJavaSwing {
    public static void main(String[] args) {
        
        String n1txt = JOptionPane.showInputDialog(null,"Digite um número: ",null, JOptionPane.QUESTION_MESSAGE);
        
        String n2txt = JOptionPane.showInputDialog(null, "Digite outro número: ", "Somando Valores", JOptionPane.QUESTION_MESSAGE);

        int n1 = Integer.parseInt(n1txt);
        int n2 = Integer.parseInt(n2txt);
        int soma = n1+n2;

        JOptionPane.showMessageDialog(null, "Resultado = " + soma);

        System.out.println(soma);
    }
}

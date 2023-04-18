package Ex007InterfaceComJavaSwing;

import javax.swing.JOptionPane;

public class Ex007TiposDeInterface {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá " + frase);

        String[] arrayDeOpcoes = {
            "Opcão - 1", "Opcão - 2", "Opcão - 3", "Opcão - 4", "Opcão - 5"
        };

        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Título", 0, JOptionPane.QUESTION_MESSAGE, null, arrayDeOpcoes, 0);

        JOptionPane.showMessageDialog(null, "Você escolheu " + arrayDeOpcoes[opcao]);
    }
}

package java_poo.Ex014Constantes;

import java_poo.Ex014Constantes.matematica.*;

public class App {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.println(login.verificarSenha("1234567"));
        System.out.println(login.verificarSenha("123456"));

        Cpf cpfValido = new Cpf("37154318147");
        Cpf cpfInvalido = new Cpf("71325");
        cpfValido.validar();
        cpfInvalido.validar();

        Matematica.calcularAreaCirculo(4);
    }
}

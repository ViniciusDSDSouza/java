package java_poo.Ex014Constantes;

public class Login {
    private static final int TAMANHO_MINIMO_SENHA = 7;
    
    public boolean verificarSenha(String senha) {
        if(senha.length() < TAMANHO_MINIMO_SENHA) {
            return false;
        }
        else {
            return true;
        }
    }
}
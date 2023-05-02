package java_poo.Ex014Constantes;

public class Cpf {
            // ABC.DEF.GHI-JK
            // A-H: Identificador emitido pela RF
            // I: Região
            // J-K: Digitos Verificadores
    private static final int INDICE_PRIMEIRO_IDENTIFICADOR_EMITIDO_PELA_RF = 0;
    private static final int INDICE_SEGUNDO_IDENTIFICADOR_EMITIDO_PELA_RF = 1;
    private static final int INDICE_TERCEIRO_IDENTIFICADOR_EMITIDO_PELA_RF = 2;
    private static final int INDICE_QUARTO_IDENTIFICADOR_EMITIDO_PELA_RF = 3;
    private static final int INDICE_QUINTO_IDENTIFICADOR_EMITIDO_PELA_RF = 4;
    private static final int INDICE_SEXTO_IDENTIFICADOR_EMITIDO_PELA_RF = 5;
    private static final int INDICE_SETIMO_IDENTIFICADOR_EMITIDO_PELA_RF = 6;
    private static final int INDICE_OITAVO_IDENTIFICADOR_EMITIDO_PELA_RF = 7;
    private static final int INDICE_VERIFICADOR_DE_REGIAO = 8;
    private static final int INDICE_PRIMEIRO_DIGITO_VERIFICADOR = 9;
    private static final int INDICE_SEGUNDO_DIGITO_VERIFICADOR = 10;

    private boolean isValido;
    
    public Cpf (String cpf) {

        if(cpf.length() != 11) {
            isValido = false;

        } else {
            isValido = true;
            char primeiroIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_PRIMEIRO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char segundoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_SEGUNDO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char terceiroIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_TERCEIRO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char quartoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_QUARTO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char quintoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_QUINTO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char sextoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_SEXTO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char setimoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_SETIMO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char oitavoIdentificadorEmitidoPelaRF = cpf.charAt(INDICE_OITAVO_IDENTIFICADOR_EMITIDO_PELA_RF);
            char verificadorDeRegiao = cpf.charAt(INDICE_VERIFICADOR_DE_REGIAO);
            char primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_DIGITO_VERIFICADOR);
            char segundoDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_DIGITO_VERIFICADOR);

            System.out.printf("%s%s%s.%s%s%s.%s%s%s-%s%s\n",
            primeiroIdentificadorEmitidoPelaRF,
            segundoIdentificadorEmitidoPelaRF,
            terceiroIdentificadorEmitidoPelaRF,
            quartoIdentificadorEmitidoPelaRF,
            quintoIdentificadorEmitidoPelaRF,
            sextoIdentificadorEmitidoPelaRF,
            setimoIdentificadorEmitidoPelaRF,
            oitavoIdentificadorEmitidoPelaRF,
            verificadorDeRegiao,
            primeiroDigitoVerificador,
            segundoDigitoVerificador);
        }
    }
    public void validar() {
        if(isValido == true) {
            System.out.println("O cpf é válido!");
        }else if(isValido == false) {
            System.out.println("O cpf é inválido!");
        }else {
            System.out.println("[erro] isValido = null");
        }
    }
}

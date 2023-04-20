package java_poo.Ex005GetSet.Classes;

public class Conta {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f reais concluída!\n",valor);
        } else {
            System.out.println("Digite um valor válido!");
        }
    }

    public void retirar(double valor) {
        if (valor < 0) {
            System.out.print("Digite um valor válido!");
        } else {
            if (saldo - valor >= 0) {
                saldo -= valor;
                System.out.printf("Retirada de R$%.2f reais concluída!\n",valor);
            } else {
                System.out.println("Erro ao concluir retirada! Você não pode ficar com saldo negativo!");
            }
        }
    }

    public void getSaldo() {
        System.out.printf("Seu saldo é de R$%.2f reais.\n",saldo);
    }
}

package edu.baco.utilitarios;

import edu.baco.conta.Conta;

public class Sacar {
    public static boolean sacar(Conta conta, double valor){
        if (valor > 0 && conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso.");
            System.out.println("saldo atual no valor de R$" + conta.getSaldo());
            return true;
        } else {
            System.out.println("Saque não realizado, verifique o saldo disponivel ");
            return false;
        }
    }
}

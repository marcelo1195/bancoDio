package edu.baco.utilitarios;
import edu.baco.conta.Conta;

public class Depositar {

    public static boolean depositar(Conta conta, double valor){
        if (valor > 0){
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " efetuado com sucesso.");
            return true;
        } else {
            System.out.println("valor de depósito invalido.");
            return false;
        }
    }
}

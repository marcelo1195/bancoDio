package edu.baco.utilitarios;

import edu.baco.conta.Conta;

public class Transferir {
    public static boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor > 0 && contaOrigem.getSaldo() >= valor ) {
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            contaOrigem.setSaldo(contaOrigem.getSaldo()-valor);
            System.out.println("Transferencia de R$" + valor + " Para a  " + contaDestino.getNome() + " " + contaDestino.getSobrenome() + " Conta N" + contaDestino.getNumero());
            return true;
        } else {
            System.out.println("Transferencia não realizada. Verifique o valor e o saldo disponivel");
            return false;
        }
    }
}

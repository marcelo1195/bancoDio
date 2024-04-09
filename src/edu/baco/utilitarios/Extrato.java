package edu.baco.utilitarios;

import edu.baco.conta.Conta;

public class Extrato {

    public static String gerarExtrato(Conta conta) {
        String extrato = "Extrato da Conta\n" +
                "Titular: " + conta.getNome() + " " + conta.getSobrenome() + "\n" +
                "Saldo Atual: R$" + String.format("%.2f", conta.getSaldo()) + "\n" +
                "Limite Disponível: R$" + String.format("%.2f", conta.getLimite());
        return extrato;
    }
}

package edu.baco.utilitarios;

import edu.baco.conta.Conta;
import edu.baco.interfaces.EmprestimoHabilitado;

public class Emprestimo {
    public static boolean realizarEmprestimo (Conta conta, double valor){

        if (valor < (conta.getSaldo()*10))
            if (conta instanceof EmprestimoHabilitado && valor > 0 ) {
                conta.setSaldo(conta.getSaldo() + valor);
                System.out.println("Emprestimo realizado no valor de R$" + valor);
                System.out.println("Saldo atual no valor de " + conta.getSaldo());
                return true;
            } else {
                System.out.println("Conta não elegivel para Emprestimo, ou valor invalido");
                return false;
            }
        else {
            System.out.println("Valor de emprestimo indiponovel");
            return false;
        }

    }
}

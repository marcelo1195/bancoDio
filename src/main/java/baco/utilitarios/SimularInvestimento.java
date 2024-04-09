package baco.utilitarios;
import baco.conta.Conta;

public class SimularInvestimento {

    public static double calcularMontante(Conta conta, double valorInicial, int tempoMeses){
    double taxaRendimento = conta.getTaxaRendimento();
    return valorInicial * Math.pow(1 + taxaRendimento, tempoMeses);
    }

    public static String simularInvestimento(Conta conta, double valorInicial, int tempoMeses){
        double montante = calcularMontante(conta, valorInicial, tempoMeses);
        return String.format("O montante acumulado após %d meses será de R$%.2f", tempoMeses, montante );
    }
}



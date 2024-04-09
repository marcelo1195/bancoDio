package baco.utilitarios;

import baco.conta.Conta;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SimularInvestimentoTest {

    @Test
    void calcularMontante() {
        // Configuração
        Conta contaMock = Mockito.mock(Conta.class);
        Mockito.when(contaMock.getTaxaRendimento()).thenReturn(0.005);
        // Ação
        double montante = SimularInvestimento.calcularMontante(contaMock, 1000, 12);

        // Verificação
        assertEquals(1061.68, montante, 0.01); // O valor esperado baseia-se no calculo de jurus compostos
    }

    @Test
    void simularInvestimento() {
        // Configuração
        Conta contaMock = Mockito.mock(Conta.class);
        Mockito.when(contaMock.getTaxaRendimento()).thenReturn(0.005);

        // Ação
        String resultado = SimularInvestimento.simularInvestimento(contaMock, 1000, 12);

        // Verificação
        String esperadao = "O montante acumulado após 12 meses será de R$1061.68";
        assertEquals(esperadao, resultado);
    }
}
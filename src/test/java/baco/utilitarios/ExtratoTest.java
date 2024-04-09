package baco.utilitarios;

import baco.conta.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static  org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ExtratoTest {

    private Conta contaTest;

    @BeforeEach
    void setUp() {
        contaTest = Mockito.mock(Conta.class);
        when(contaTest.getNome()).thenReturn("João");
        when(contaTest.getSobrenome()).thenReturn("Silva");
        when(contaTest.getSaldo()).thenReturn(1500.0);
        when(contaTest.getLimite()).thenReturn(500.0);
    }

    @Test
    void gerarExtrato() {
        String resultado = Extrato.gerarExtrato(contaTest);

        String extratoEsperado = "Extrato da Conta\n" +
                "Titular: João Silva\n" +
                "Saldo Atual: R$1500.00\n" +
                "Limite Disponível: R$500.00";
        assertEquals(extratoEsperado, resultado);
    }
}
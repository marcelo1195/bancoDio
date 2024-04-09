package baco.utilitarios;

import baco.conta.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;



class DepositarTest {

    private Conta contaTest;

    @BeforeEach
    void setUp(){
        contaTest = Mockito.mock(Conta.class);
        when(contaTest.getSaldo()).thenReturn(1000.0);
    }

    @Test
    void depositar() {
        double valorDeposito = 200.0;
        boolean resultado = Depositar.depositar(contaTest, valorDeposito);

        assertTrue(resultado);
        verify(contaTest).setSaldo(1200.0);
    }

    @Test
    void depositarFalha(){
        double valorDeposito = -50;
        boolean resultado = Depositar.depositar(contaTest, valorDeposito);

        assertFalse(resultado);
        verify(contaTest, never()).setSaldo(anyDouble());
    }
}
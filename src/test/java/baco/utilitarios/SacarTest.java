package baco.utilitarios;

import baco.conta.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SacarTest {

    private Conta contaTest;

    @BeforeEach
    void setUp() {
        contaTest = mock(Conta.class); // Configuração
    }

    @Test
    void sacarBemSucedido() {
        when(contaTest.getSaldo()).thenReturn(500.0); // Configuração
        double valorSaque = 400; // Configuração

        // Ação
        boolean resultado = Sacar.sacar(contaTest, valorSaque);

        // Verificação
        assertTrue(resultado);
        verify(contaTest).setSaldo(100);
    }
    @Test
    void sacarMalSucedido(){
        when(contaTest.getSaldo()).thenReturn(500.0);
        double valorSaque = 600.0;

        boolean resultado = Sacar.sacar(contaTest, valorSaque);

        assertFalse(resultado);
        verify(contaTest, never()).setSaldo(anyDouble());
    }
}
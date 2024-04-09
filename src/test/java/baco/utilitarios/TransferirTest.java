package baco.utilitarios;

import baco.conta.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;



import static org.junit.jupiter.api.Assertions.*;

class TransferirTest {

    private Conta contaOrigem;
    private Conta contaDestino;

    @BeforeEach
    // Configuração
    void setUp() {
        contaOrigem = mock(Conta.class);
        contaDestino = mock(Conta.class);
    }

    @Test
    void transferenciaBemSucedida(){ // Configuração
        when(contaOrigem.getSaldo()).thenReturn(1000.0); // Configuração
        double valorTransferencia = 100.0; // Configuração


        // Ação
        boolean resultado = Transferir.transferir(contaOrigem, contaDestino, valorTransferencia);

        // Verificação
        assertTrue(resultado);
        verify(contaOrigem).setSaldo(900);
        verify(contaDestino).setSaldo(100);
    }
    @Test
    void transferenciaMalSucedida(){ // Configuração
        when(contaOrigem.getSaldo()).thenReturn(50.0); // Configuração
        double valorTransferencia = 100.0; // Configuração

        // Ação
        boolean resultado = Transferir.transferir(contaOrigem, contaDestino, valorTransferencia);

        // Verificação
        assertFalse(resultado);
        verify(contaOrigem, never()).setSaldo(anyDouble()); // Verifica se o saldo da conta origem não foi alterado
        verify(contaDestino, never()).setSaldo(anyDouble()); // Verifica se o saldo da conta destino não foi alterado
    }


}
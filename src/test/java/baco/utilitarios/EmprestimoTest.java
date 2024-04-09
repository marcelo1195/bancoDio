package baco.utilitarios;

import baco.conta.Conta;
import baco.interfaces.EmprestimoHabilitado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    private Conta contaHabilitada;
    private Conta contaNaoHabilitada;

    @BeforeEach
    void setUp() {
        // Conta habilitada para empréstimo
        contaHabilitada = mock(Conta.class, withSettings().extraInterfaces(EmprestimoHabilitado.class));
        when(contaHabilitada.getSaldo()).thenReturn(1000.0);

        // Conta não habilitada para empréstimo
        contaNaoHabilitada = mock(Conta.class);
        when(contaNaoHabilitada.getSaldo()).thenReturn(1000.0);
    }

    @Test
    void emprestimoRealizadoComSucesso() {
        // Ação
        boolean resultado = Emprestimo.realizarEmprestimo(contaHabilitada, 500.0);

        // Verificação
        assertTrue(resultado);
        verify(contaHabilitada).setSaldo(1500.0);
    }

    @Test
    void emprestimoFalhaPorContaIneligivel() {
        // Ação
        boolean resultado = Emprestimo.realizarEmprestimo(contaNaoHabilitada, 500.0);

        // Verificação
        assertFalse(resultado);
        verify(contaNaoHabilitada, never()).setSaldo(anyDouble());
    }

    @Test
    void emprestimoFalhaPorValorExcedente() {
        // Ação
        boolean resultado = Emprestimo.realizarEmprestimo(contaHabilitada, 20000.0);

        // Verificação
        assertFalse(resultado);
        verify(contaHabilitada, never()).setSaldo(anyDouble());
    }
}

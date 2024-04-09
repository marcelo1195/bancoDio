import baco.conta.contacorrente.ContaCorrente;
import baco.conta.contajovem.ContaJovem;
import baco.conta.contapoupanca.ContaPoupanca;
import baco.conta.contasalario.ContaSalario;
import baco.utilitarios.Depositar;
import baco.utilitarios.*;


public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1, 111, 1000, 5000, 200, "João", "Silva", "9999-9999", 1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 222, 1000, 5000, 400, "Maria", "Oliveira", "8888-8888", 2);
        ContaJovem contaJovem = new ContaJovem(3, 333, 500, 1000, 100, "Lucas", "Santos", "7777-7777", 3);
        ContaSalario contaSalario = new ContaSalario(4, 444, 3000, 1000, 0, "Ana", "Costa", "6666-6666", 4);


        System.out.println("---- Realizando Operações ----");
        Depositar.depositar(contaCorrente, 500);
        System.out.println(" ");
        Sacar.sacar(contaPoupanca, 300);
        System.out.println(" ");
        Transferir.transferir(contaCorrente, contaPoupanca, 200);
        System.out.println(" ");
        Emprestimo.realizarEmprestimo(contaCorrente, 1000);  // Assumindo que ContaCorrente implementa EmprestimoHabilitado
        System.out.println(" ");


        System.out.println("---- Exibindo Extratos ----");
        System.out.println(Extrato.gerarExtrato(contaCorrente));
        System.out.println(" ");
        System.out.println(Extrato.gerarExtrato(contaPoupanca));
        System.out.println(" ");
        System.out.println(Extrato.gerarExtrato(contaJovem));
        System.out.println(" ");
        System.out.println(Extrato.gerarExtrato(contaSalario));
    }
}

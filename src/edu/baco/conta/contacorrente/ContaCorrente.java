package edu.baco.conta.contacorrente;
import edu.baco.conta.Conta;

public class ContaCorrente extends Conta implements edu.baco.interfaces.EmprestimoHabilitado {

    public ContaCorrente(int agencia, int numero, double saldo, double limite, double investimento, String nome, String sobrenome, String telefone, int type, boolean emprestimo) {
        super(agencia, numero, saldo, limite, investimento, nome, sobrenome, telefone, type, emprestimo);
    }

    public boolean solicitarEmprestimo(double valor){
     if (this.isEmprestimo()){
         this.setSaldo(this.getSaldo() +valor);
         System.out.println("Emprestimo efetuado no valor " + valor);
         return true;
     }  else {
         System.out.println("Conta não elegivel para emprestimo");
         return false;}
    };

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", saldo=" + getSaldo() +
                ", limite=" + getLimite() +
                ", investimento=" + getInvestimento() +
                ", nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", type=" + gettype() +
                ", emprestimo=" + isEmprestimo() +
                '}';
    }
}

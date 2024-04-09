package baco.conta.contajovem;
import baco.conta.Conta;
import baco.interfaces.EmprestimoHabilitado;

public class ContaJovem extends Conta implements EmprestimoHabilitado {
    public ContaJovem(int agencia, int numero, double saldo, double limite, double investimento, String nome, String sobrenome, String telefone, int type) {
        super(agencia, numero, saldo, limite, investimento, nome, sobrenome, telefone, type, type==3);
        this.setEmprestimo(type==2);
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
    public double getTaxaRendimento() {
        switch (gettype()){
            case 1:
                return 0.005; // 0.5% para type1
            case 2:
                return 0.008; // 0.8% para type2
            case 3:
                return 0.004; // 0.4% para type3
            case 4:
                return 0.002; // 0.2% para type4
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "ContaJovem{" +
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

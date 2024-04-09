package edu.baco.conta;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private double limite;
    private double investimento;
    private String nome;
    private String sobrenome;
    private String telefone;
    private int type; // type "1" = conta corrente | type "2" = conta poupanca | type "3" = conta Jovem | type "4" = conta salario
    protected boolean emprestimo;

    public Conta(int agencia, int numero, double saldo, double limite, double investimento, String nome, String sobrenome, String telefone, int type, boolean emprestimo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.investimento = investimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.type = type;
        this.emprestimo = (type == 1 || type ==2);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setType(int type){
       this.type = type;
    }

    public int gettype(){
        return type;
    }

    public int getType() {
        return type;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", investimento=" + investimento +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", type=" + type +
                '}';
    }

}

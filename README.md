Simulação de Sistema Bancário em Java
Sobre o Projeto
Este repositório contém o código-fonte para uma simulação de um sistema bancário desenvolvido em Java, parte do desafio de projeto de Programação Orientada a Objetos (POO) da plataforma Digital Innovation One (DIO). O sistema simula operações bancárias básicas como saques, depósitos, transferências e empréstimos, e representa diferentes tipos de contas bancárias.

Funcionalidades
Conta Corrente: Contas padrão para transações diárias.
Conta Poupança: Contas para economias com recursos para empréstimo.
Conta Jovem: Contas destinadas a um público mais jovem com incentivos para poupança e investimento.
Conta Salário: Contas simplificadas para a recepção de salários com funcionalidades limitadas.
Operações Bancárias: Realizar operações como depósito, saque, transferência e solicitar empréstimos.
Extrato: Geração de extrato bancário para contas.
Estrutura do Projeto
O projeto é composto por classes que representam diferentes tipos de contas bancárias, bem como classes utilitárias que simulam operações bancárias:

Conta.java: Classe abstrata base para todos os tipos de contas bancárias.
ContaCorrente.java, ContaPoupanca.java, ContaJovem.java, ContaSalario.java: Subclasses de Conta que representam diferentes tipos de contas bancárias.
Depositar.java, Sacar.java, Transferir.java, Extrato.java, Emprestimo.java: Classes utilitárias para simular operações bancárias.

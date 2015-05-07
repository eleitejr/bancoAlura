package br.com.empresa.banco.contas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String nome, int agencia, double saldo, double limite) {
		super(nome, agencia, saldo, limite);

	}

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa){
		this.saldo += this.getSaldo() * taxa * 3;
	}

	@Override
	public void deposita(double deposito){
		this.saldo += deposito;
		double taxaBancaria = 0.10;
		this.saldo -= taxaBancaria;
	}
}
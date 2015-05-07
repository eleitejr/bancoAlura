package br.com.empresa.banco.contas;

import br.com.empresa.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(String nome, int agencia, double saldo, double limite) {
		super(nome, agencia, saldo, limite);

	}

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa){
		this.saldo += this.getSaldo() * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
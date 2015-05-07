package br.com.empresa.banco.sistema;

import br.com.empresa.banco.contas.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private final double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {

		System.out.printf("Saldo anterior: R$ %.2f \n",  c.getSaldo());
		c.atualiza(this.selic);
		System.out.printf("Saldo final: R$ %.2f \n", c.getSaldo());
		System.out.println();
		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal(){
		return this.saldoTotal;
	}

	public double getSelic(){
		return this.selic;
	}
}

package br.com.empresa.banco;

import br.com.empresa.banco.contas.Conta;
import br.com.empresa.banco.contas.ContaCorrente;
import br.com.empresa.banco.contas.ContaPoupanca;
import br.com.empresa.banco.contas.SaldoInsuficienteException;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		try {
			c.saca(2000);
		} catch (SaldoInsuficienteException e) {
			System.out.println("O saldo está insuficiente: "
					+ e.getSaldoAtual());
		}

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.printf("O saldo é: R$ %.2f \n", c.getSaldo());
		System.out.printf("O saldo é: R$ %.2f \n", cc.getSaldo());
		System.out.printf("O saldo é: R$ %.2f \n", cp.getSaldo());

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.printf("Saldo total das contas: R$ %.2f \n",
				adc.getSaldoTotal());

	}
}

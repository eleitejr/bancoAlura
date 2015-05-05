package testes;

import contas.Conta;
import contas.ContaCorrente;
import contas.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {

		Conta cp = new ContaCorrente();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}

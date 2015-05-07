package br.com.empresa.banco.contas;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {

	private double saldoAtual;

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}



}
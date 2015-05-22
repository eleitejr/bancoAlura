package br.com.empresa;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionario: " + f);
		this.totalDeBonificacoes += f.getBonus();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
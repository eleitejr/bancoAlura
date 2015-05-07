package br.com.empresa.banco.contas;


public abstract class Conta {
	protected String nome;
	protected int agencia;
	protected double saldo;
	protected double limite;

	public Conta(String nome, int agencia, double saldo, double limite) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Conta() {
		super();
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
		else throw new ValorInvalidoException(valor);
	}


	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

		}

		else throw new SaldoInsuficienteException (saldo);
	}

	public abstract void atualiza(double taxa);
}

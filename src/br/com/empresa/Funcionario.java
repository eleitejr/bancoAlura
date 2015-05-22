package br.com.empresa;

/**
 * 
 * @class Funcionario
 */

public abstract class Funcionario {

	protected final int identificador;
	protected double salario;
	protected String nome, rg, departamento;
	protected Data dataDeEntrada;
	private static int totalDeFuncionarios;

	// CONSTRUTORES

	public Funcionario(String nome, String rg, String departamento, double salario, Data dataDeEntrada){
		this.nome = nome;
		this.rg = rg;
		this.departamento = departamento;
		this.salario = salario;
		Funcionario.totalDeFuncionarios++;
		this.identificador = Funcionario.getTotalDeFuncionarios();
	}

	public Funcionario(String nome){
		this(nome, null, null, 0, null);
	}

	public Funcionario(){
		this(null, null, null, 0, null);
	}

	// GETTERS	

	public double getGanhoAnual() {
		return this.salario * 12;
	}

	public double getSalario(){
		return this.salario;
	}

	public String getNome() {
		return this.nome;
	}

	public String getRg() {
		return this.rg;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public Data getDataDeEntrada() {
		return this.dataDeEntrada;
	}

	public static int getTotalDeFuncionarios() {
		return Funcionario.totalDeFuncionarios;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public abstract double getBonus();

	// SETTERS

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setDataDeEntrada(int diaEnt, int mesEnt, int anoEnt) {
		Data xdata = new Data();
		xdata.dia = diaEnt;
		xdata.mes = mesEnt;
		xdata.ano = anoEnt;

		if(xdata.dataValida()) {

			this.dataDeEntrada = new Data();		
			this.dataDeEntrada = xdata;
		}

	}

	public void recebeAumento(double aumento) {
		setSalario (getSalario() + aumento);
	}

	public void mostra() {
		System.out.println("Identificador: " + this.getIdentificador());
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.println("Data de Entrada: " + this.getDataDeEntrada().formatada() );
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salario: R$  " + this.getSalario());
		System.out.println("Bonificacao: R$ " + this.getBonus());
		System.out.println("Ganho Anual: R$  " +  this.getGanhoAnual());
		System.out.println();
	}
}

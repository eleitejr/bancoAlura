package br.com.empresa;

/**
 *	Classe que representa o modelo do banco
 *
 * @class Empresa
 */

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private String endereco;
	private String telefone;
	private int posLivre; // variavel que indica a posição livre na array

	// CONSTRUTORES

	public Empresa(String nomeEmpresa, String cnpjEmpresa, String enderecoEmpresa, String telefoneEmpresa){
		this.empregados = new Funcionario[4];
		this.nome = nomeEmpresa;
		this.cnpj = cnpjEmpresa;
		this.endereco = enderecoEmpresa;
		this.telefone = telefoneEmpresa;
		this.posLivre = 0;
	}

	public Empresa(String nomeEmpresa){
		this(nomeEmpresa, null, null, null);
	}

	public Empresa( int tamanho ){
		this(null, null, null, null);
		this.empregados = new Funcionario[tamanho];
	}

	// GETTERS

	public String getNome() {
		return this.nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public int getPoslivre() {
		return this.posLivre;
	}

	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}

	// SETTERS

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	// OUTROS METODOS

	public void incPosLivre(){
		this.posLivre++;
	}

	public void adiciona(Funcionario f) {
		System.out.println("Incluindo funcionario:");
		f.mostra();
		this.empregados[this.getPoslivre()] = f;
		this.incPosLivre();
	}

	public void mostraEmpregados() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Lista de Empregados da Empresa " + this.getNome());
		System.out.println("-----------------------------------------------------------------");
		System.out.println();

		for (Funcionario f: this.empregados) {
			System.out.println("Funcionario na posicao: " + f.getIdentificador() );
			f.mostra();
		}
	}

}





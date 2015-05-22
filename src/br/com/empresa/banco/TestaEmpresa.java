package br.com.empresa.banco;

import br.com.empresa.CaixaExecutivo;
import br.com.empresa.Empresa;
import br.com.empresa.Escriturario;
import br.com.empresa.Funcionario;
import br.com.empresa.Gerente;

/*
 * 
 * @class TestaEmpresa
 * @author Erasmo Leite Jr
 * 
 * @comment Esta classe testa o funcionamento do pacote Empresa
 */
class TestaEmpresa {
	public static void main(String[] args) {

		Empresa empresa = new Empresa("Banco Dindim S/A");

		Funcionario f1 = new Gerente();
		f1.setNome("Pedro da Silva");
		f1.setRg("15656 SSP-GO");
		f1.setDepartamento("Vendas");
		f1.setSalario(1000.00);
		f1.setDataDeEntrada(12, 3, 2012);
		empresa.adiciona(f1);

		Funcionario f2 = new CaixaExecutivo();
		f2.setNome("Luiza Gomes de Souza");
		f2.setRg("898989 SSP-SP");
		f2.setDepartamento("Bateria Subsolo");
		f2.setSalario(1200.00);
		f2.setDataDeEntrada(22, 4, 2014);
		empresa.adiciona(f2);

		Funcionario f3 = new Escriturario();
		f3.setNome("Antonio Pedro");
		f3.setRg("898933 SSP-DF");
		f3.setDepartamento("Suporte");
		f3.setSalario(1300.00);
		f3.setDataDeEntrada(11, 1, 2011);
		empresa.adiciona(f3);

		Funcionario f4 = new Escriturario();
		f4.setNome("Joaquim Barbosa");
		f4.setRg("73699 SSP-DF");
		f4.setDepartamento("Juridico");
		f4.setSalario(1500.00);
		f4.setDataDeEntrada(12, 3, 2010);
		empresa.adiciona(f4);

		empresa.mostraEmpregados();
	}

}

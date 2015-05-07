package br.com.empresa.banco.contas;

import br.com.empresa.banco.sistema.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calculaTributos() {
		return 42;
	}

}

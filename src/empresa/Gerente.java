package empresa;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonus() {
		return this.salario * 1.4 + 1000;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha != senha) {
			return false;
		}
		// pode fazer outras poss�veis verifica��es, como saber se esse 
		// departamento do gerente tem acesso ao Sistema

		return true;
	}

}

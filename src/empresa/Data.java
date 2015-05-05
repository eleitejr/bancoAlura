package empresa;

/**
 * 
 * @author Erasmo
 *
 */

class Data{
	int dia, mes, ano;

	public void msgErro(){
		System.out.println("Erro! Data Incorreta!");
		System.out.println();
	}

	public boolean dataValida(){
		switch(this.mes){
		case 2: 
			if (this.dia > 28) {
				this.msgErro();
				return false;
			}
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			if(this.dia > 31) {
				this.msgErro();
				return false;
			}
			break;
		case 4: case 6: case 9: case 11:  
			if (this.dia > 30) {
				this.msgErro();
				return false;
			}
			break;
		}
		return true;
	}

	public String formatada() {
		return ( this.dia + "/" + this.mes + "/" + this.ano );
	}
}

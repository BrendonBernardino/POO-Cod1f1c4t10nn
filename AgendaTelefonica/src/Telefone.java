
public class Telefone {
	private int numero;
	private int ddd;
	
	Telefone() {
		
	}
	
	Telefone (int numero) {
		this.numero = numero;
	}
	
	Telefone (int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	@Override
	public String toString() {
		return "(" + this.ddd + ")" + this.numero;
	}
}

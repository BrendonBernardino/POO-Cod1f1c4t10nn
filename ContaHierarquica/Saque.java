
public class Saque extends Operacao{
	private Conta origem;

	Saque(double valor, Conta origem) {
		super(valor);
		this.origem = origem;
	}
	
	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}
	
	@Override
	public String toString() {
		return super.toString() + this.origem.getNumero();
	}
}

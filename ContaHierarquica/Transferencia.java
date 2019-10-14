
public class Transferencia extends Operacao{
	private Conta origem;
	private Conta destino;

	Transferencia(double valor, Conta origem, Conta destino) {
		super(valor);
		this.origem = origem;
		this.destino = destino;
	}
	
	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		return super.toString() + "De: " + this.origem.getNumero() + " Para: " + this.destino.getNumero();
	}
}

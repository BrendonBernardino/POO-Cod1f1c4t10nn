
public class ContaEspecial extends Conta{
	private double limite = 200.0;
	
	ContaEspecial(int numero, double saldo, Cliente titular) {
		super(numero, saldo, titular);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	@Override
	boolean sacar(Saque saque) {
		if(saque.getValor() <= (this.saldo + this.limite) && saque.getValor() > 0) {
			this.saldo -= saque.getValor();
			this.listaOp.add(saque); //para contabilizar na lista de operação
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Limite extra: " + this.limite;
	}

	
}

import java.util.ArrayList;
public class Conta {
	protected int numero;
	protected double saldo;
	protected double limite = 500;
	protected Cliente titular;
	protected ArrayList <Operacao> listaOp = new ArrayList <Operacao> ();
	
	Conta() {
		
	}
	
	Conta(int numero, double saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.listaOp = new ArrayList <Operacao> ();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public ArrayList <Operacao> getListaOp() {
		return this.listaOp;
	}
	
	public void setListaOp(ArrayList <Operacao> listaOp) {
		this.listaOp = listaOp;
	}
	
	boolean sacar(Saque saque) {
		if(saque.getValor() <= this.saldo && saque.getValor() > 0) {
			if(saque.getValor() <= this.limite) {
				this.saldo -= saque.getValor();
				this.listaOp.add(saque); //para contabilizar na lista de operação
				return true;
			}
			System.out.println("Saque nulo ou acima do limite permitido.");
		}
		return false;
	}
	
	boolean depositar(Operacao operacao) {
			if(operacao.getValor() > 0) {
				this.saldo += operacao.getValor();
				this.listaOp.add(operacao); //para contabilizar na lista de operação
				return true;
			}
		return false;
	}
	
	boolean transferir(Transferencia transferencia) {
		double saldoDestino = transferencia.getDestino().getSaldo();
		if(transferencia.getValor() <= this.limite && transferencia.getValor() > 0) {
			this.saldo -= transferencia.getValor();
			saldoDestino += transferencia.getValor();
			transferencia.getDestino().setSaldo(saldoDestino);
			this.listaOp.add(transferencia); //para contabilizar na lista de operação
			return true;
		}
		return false;
	}
	

	String imprimirExtratoFull() {
		return this.listaOp.toString();
	}
	
	String imprimirExtrato(int numOperacoes) {
		String aux = "";
		String extrato = "";
		if(numOperacoes <= this.listaOp.size()) {
			for(int i = this.listaOp.size()-1 ; i >= 0 ; i--) {
				aux = this.listaOp.get(i).toString();
				extrato = extrato.concat(aux) + "\n";
			}
		}
		return extrato;
	}
	
	@Override
	public String toString(){
		return this.numero + " " + this.saldo + " " + this.limite + " " + this.titular.toString() + " " + this.listaOp.toString();
	}
}

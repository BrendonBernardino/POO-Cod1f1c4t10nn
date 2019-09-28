import java.util.*;
public class Conta {
	private int numero;
	private double saldo;
	private double limite = 10000;
	Cliente titular;
	List <Operacao> listaOp;
	
	Conta() {
		
	}
	
	Conta(int numero, double saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
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
	
	public List <Operacao> getListaOp() {
		return this.listaOp;
	}
	
	public void setListaOp(List <Operacao> listaOp) {
		this.listaOp = listaOp;
	}
	
	boolean sacar(Operacao operacao) {
		if(operacao.getTipoOperacao() == "sacar") {
			if(operacao.getValor() <= this.saldo && operacao.getValor() > 0) {
				this.saldo -= operacao.getValor();
				return true;
			}
		}
		return false;
	}
	
	boolean depositar(Operacao operacao) {
		if(operacao.getTipoOperacao() == "depositar") {
			if(operacao.getValor() <= this.limite && operacao.getValor() > 0) {
				this.saldo += operacao.getValor();
				return true;
			}
		}
		return false;
	}
	
	String imprimirExtratoFull() {
		return this.listaOp.toString();
	}
	
	String imprimirExtrato(int numOperacoes) {
		String aux, extrato = null;
		if(numOperacoes <= this.listaOp.size()) {
			for(int i = this.listaOp.size()-1 ; i >= 0 ; i--) {
				aux = this.listaOp.get(i).toString();
				extrato = extrato.concat(aux);
			}
		}
		return extrato;
	}
	
	@Override
	public String toString(){
		return this.numero + " " + this.saldo + " " + this.limite + " " + this.titular.toString() + " " + this.listaOp.toString();
	}
}

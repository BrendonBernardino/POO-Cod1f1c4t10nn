public class Operacao {
	private String tipoOperacao;
	private double valor;
	
	Operacao(String tipoOperacao, double valor) {
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.tipoOperacao + " " + this.valor;
	}
}

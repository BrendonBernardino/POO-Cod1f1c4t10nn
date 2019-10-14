
public class PessoaJuridica extends Contribuinte{
	private String cpf;
	
	
	PessoaJuridica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
	}
	
	PessoaJuridica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		double imposto;
		imposto = this.rendaBruta * 0.1;
		return imposto;
	}
}

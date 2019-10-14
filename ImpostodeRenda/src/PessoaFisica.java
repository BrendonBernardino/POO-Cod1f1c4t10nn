
public class PessoaFisica extends Contribuinte{
	private String cnpj;
	
	PessoaFisica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
	}
	
	PessoaFisica(String nome, double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	@Override
	public double calcularImposto() {
		double imposto = 0;
		if(this.rendaBruta >= 0.00 && this.rendaBruta <= 1400.00) {
			imposto = 0;
		}
		
		if(this.rendaBruta > 1400.00 && this.rendaBruta <= 2100.00) {
			imposto = this.rendaBruta * 0.1;
		}
		
		if(this.rendaBruta > 2100.00 && this.rendaBruta <= 2800.00) {
			imposto = this.rendaBruta * 0.15;
		}
		
		if(this.rendaBruta > 2800.00 && this.rendaBruta <= 3600.00) {
			imposto = this.rendaBruta * 0.25;
		}
		
		if(this.rendaBruta > 3600.00) {
			imposto = this.rendaBruta * 0.3;
		}
		return imposto;
	}
}

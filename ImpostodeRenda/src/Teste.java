
public class Teste {
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Brendon", 1000.0);
		PessoaFisica pf2 = new PessoaFisica("Natan", 2200.0);
		PessoaFisica pf3 = new PessoaFisica("Samuel", 3100.0);
		
		PessoaJuridica pj1 = new PessoaJuridica("Arnaldo", 2000.0);
		PessoaJuridica pj2 = new PessoaJuridica("Gabriel", 950.0);
		PessoaJuridica pj3 = new PessoaJuridica("Cintia", 3600.0);
		
		System.out.println("Primeiro imposto de renda do(a) " + pf1.getNome() + ": R$" + pf1.calcularImposto() + "\n");
		System.out.println("Imposto de renda do(a) " + pj1.getNome() + ": R$" + pj1.calcularImposto() + "\n");
		
		//setando segunda renda para pf1
		pf1.setRendaBruta(1500.0);
		System.out.println("Segundo imposto de renda do(a) " + pf1.getNome() + ": R$" + pf1.calcularImposto() + "\n");
		
		System.out.println("Imposto de renda do(a) " + pf2.getNome() + ": R$" + pf2.calcularImposto() + "\n");
		System.out.println("Imposto de renda do(a) " + pf3.getNome() + ": R$" + pf3.calcularImposto() + "\n");
		System.out.println("Imposto de renda do(a) " + pj2.getNome() + ": R$" + pj2.calcularImposto() + "\n");
		System.out.println("Imposto de renda do(a) " + pj3.getNome() + ": R$" + pj3.calcularImposto() + "\n");
		
	}
}

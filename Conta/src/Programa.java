
public class Programa {
	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Brendon");
		Conta minhaConta = new Conta(123, 100.0, c1);
		
		System.out.println("Conta: " + minhaConta.getNumero() + " || Nome: " + minhaConta.getTitular().getNome() + " || Saldo: R$" + minhaConta.getSaldo());
		
		Operacao opsac = new Operacao("sacar", 0.0);
		Operacao opdep = new Operacao("depositar", 0.0);
		
		//Operações
		
		//Primeiro deposito
		opdep.setValor(50.0); 
		System.out.println("Deposito de R$" + opdep.getValor());
		if(minhaConta.depositar(opdep)) {
			System.out.println("Deposito realizado com sucesso!");
		}
		else {
			System.out.println("Deposito negado. Acima do limite.");
		}
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		
		//Segundo deposito
		opdep.setValor(200.0);
		System.out.println("Deposito de R$" + opdep.getValor());
		if(minhaConta.depositar(opdep)) {
			System.out.println("Deposito realizado com sucesso!");
		}
		else {
			System.out.println("Deposito negado. Acima do limite.");
		}
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		
		//Terceiro deposito
		opdep.setValor(1.0);
		System.out.println("Deposito de R$" + opdep.getValor());
		if(minhaConta.depositar(opdep)) {
			System.out.println("Deposito realizado com sucesso!");
		}
		else {
			System.out.println("Deposito negado. Acima do limite.");
		}
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		
		//Primeiro saque
		opsac.setValor(350.0);
		System.out.println("Saque de R$" + opsac.getValor());
		if(minhaConta.sacar(opsac)) {
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque negado.");
		}
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		
		//Segundo saque
		opsac.setValor(10.0);
		System.out.println("Saque de R$" + opsac.getValor());
		if(minhaConta.sacar(opsac)) {
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque negado.");
		}
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		
		System.out.println("Extrato completo: " + minhaConta.imprimirExtratoFull()); // Não tá funfando
		System.out.println("Extrato: " + minhaConta.imprimirExtrato(3)); // Não tá funfando
	}
}

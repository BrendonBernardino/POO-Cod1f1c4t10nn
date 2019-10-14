public class Programa {
	public static void main(String[] args) {
		Cliente c1 = new Cliente(2, "Cliente A");
		Cliente c2 = new Cliente(3, "Cliente B");
		Conta conta1 = new Conta(111, 1000.0, c1);
		Conta conta2 = new Conta(222, 2000.0, c2);
		
		//Transferencia 1
		Transferencia transf1 = new Transferencia(50, conta1, conta2);
		System.out.println("Transferência de R$" + transf1.getValor() + "\nOrigem\n" + conta1.getTitular() + "\nDestino\n" + conta2.getTitular());
		if(conta1.transferir(transf1)) {
			System.out.println("Transferencia realizada com sucesso!");
		}
		else {
			System.out.println("Transferencia negada.");
		}
		System.out.println("Saldo " + transf1.getOrigem().getTitular().getNome() + ": R$" + transf1.getOrigem().getSaldo());
		System.out.println("Saldo " + transf1.getDestino().getTitular().getNome() + ": R$" + transf1.getDestino().getSaldo());
		System.out.println("\n");
		
		//Saque 1
		Saque saque1 = new Saque(100, conta2);
		System.out.println("Saque de R$" + saque1.getValor() + " na conta " + saque1.getOrigem().getTitular().getNome());
		if(conta2.sacar(saque1)) {
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque negado.");
		}
		System.out.println("Saldo " + saque1.getOrigem().getTitular().getNome() + ": R$" + saque1.getOrigem().getSaldo());
		System.out.println("\n");
		
		//Depósito 1
		Operacao op1 = new Operacao(500);
		System.out.println("Depósito de R$" + op1.getValor() + " na conta " + conta2.getTitular().getNome());
		if(conta2.depositar(op1)) {
			System.out.println("Depósito realizado com sucesso!");
		}
		else {
			System.out.println("Depósito negado.");
		}
		System.out.println("Saldo " + conta2.getTitular().getNome() + ": " + conta2.getSaldo());
		System.out.println("\n");
		
		//Saque 2
		Saque saque2 = new Saque(600, conta2);
		System.out.println("Saque de R$" + saque2.getValor() + " na conta " + saque2.getOrigem().getTitular().getNome());
		if(conta2.sacar(saque2)) {
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque negado.");
		}
		System.out.println("Saldo " + saque2.getOrigem().getTitular().getNome() + ": R$" + saque2.getOrigem().getSaldo());
		System.out.println("\n");
		
		//Saque 3
		Cliente c3 = new Cliente(3, "Cliente C");
		ContaEspecial conta3 = new ContaEspecial(333, 2000.0, c3);
		
		Saque saque3 = new Saque(600, conta3);
		System.out.println("Saque de R$" + saque3.getValor() + " na conta " + saque3.getOrigem().getTitular().getNome());
		if(conta3.sacar(saque3)) {
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque negado.");
		}
		System.out.println("Saldo " + saque3.getOrigem().getTitular().getNome() + ": R$" + saque3.getOrigem().getSaldo());
		System.out.println("\n");
		
		//Relatório de Operações
		int z = 4;
		System.out.println("== Extrato completo ==\n" + conta2.imprimirExtratoFull()); // Não tá funfando
		System.out.println("== Extrato " + z + " Operações ==\n" + conta2.imprimirExtrato(z)); // Não tá funfando
	}
}


public class Programa {
	public static void main(String []args) {
		Agenda agenda = new Agenda();
		Telefone telefone1 = new Telefone();
		Telefone telefone2 = new Telefone();
		Telefone telefone3 = new Telefone();
		
		//Primeiro telefone
		telefone1.setDdd(85);
		telefone1.setNumero(986200916);
		
		Contato contato1 = new Contato("Brendon", "brendonrsb@hotmail.com", telefone1);
		agenda.adicionarContato(contato1);
		
		//Segundo telefone
		telefone2.setDdd(85);
		telefone2.setNumero(988229709);
		
		Contato contato2 = new Contato("Reginaldo", "rsbgames@hotmail.com", telefone2);
		agenda.adicionarContato(contato2);
		
		
		//Terceiro telefone
		telefone3.setDdd(85);
		telefone3.setNumero(988413584);
		
		Contato contato3 = new Contato("Susu", "susursb@hotmail.com", telefone3);
		agenda.adicionarContato(contato3);
		
		System.out.println("Agenda:\n" + agenda.toString());
		
		agenda.alterarContato(contato3, "Suely", "susursb16@hotmail.com");
		System.out.println("Contato alterado:\n" + contato3.toString() + "\n");
		
		agenda.removerContato(contato2);
		System.out.println("Contato removido:\n" + agenda.toString());
		
		System.out.println("Agenda atualizada:\n" + agenda.toString());
		
	}
}

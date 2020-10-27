
public class Gerenciador {
	int identificador;
	int disponivel;
	Veiculo veic;
	
	/*public int getIdVeiculo() {
		
	}
	*/
	public int estaDisponivel() {
		disponivel = veic.getDisponibilidade();
		return disponivel;
	}
	
	public void alugar(int id) {
		if(identificador == veic.getId()) {
			veic.setDisponibilidade(0);
		}
	}
	
	public void alugarVeiculo(Veiculo veic) {
		veic.setDisponibilidade(0);
	}
	
	public void ImprimeDados(Veiculo veic) {
		System.out.println("Id:" + veic.getId());
		System.out.println("Aluguel: " + veic.calculaAluguel());
		System.out.println("Diária: " + veic.calculaDiaria());
	}
	
	public void ImprimeDiaria(Veiculo veic) {
		System.out.println("Id:" + veic.getId());
		System.out.println("Diária: " + veic.calculaDiaria());
	}
	
}

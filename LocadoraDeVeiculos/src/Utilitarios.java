import java.util.Random;

public class Utilitarios implements Veiculo{
	private int aluguel;
	private int diaria;
	private int imposto;
	private int disponibilidade = 1;
	private int id;
	
	Utilitarios(int id, int imposto) {
		this.id = id;
		this.imposto = imposto;
	}

	public int calculaAluguel() {
		aluguel = new Random().nextInt(100);
		return aluguel;
	}
	
	public int calculaDiaria() {
		diaria = imposto*aluguel;
		return diaria;
	}
	
	///////////////////////////// Getters and Setters ///////////////////////////////////

	public int getAluguel() {
		return aluguel;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public int getDiaria() {
		return diaria;
	}

	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public int getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Utilitarios\n" + "Id: " + this.id + "\nImposto: " + this.imposto + "\tAluguel: " +
				this.aluguel + "\nDiária: " + this.diaria + "\nDisponibilidade: " + this.disponibilidade;
	}
	
}

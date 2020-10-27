import java.util.Random;

public class Motos implements Veiculo{
	private int cilindrada = 125; //125cc standard
	private int aluguel;
	private int imposto;
	private int diaria;
	private int disponibilidade = 1;
	private int id;
	
	Motos(int id, int imposto) {
		this.id = id;
		this.imposto = imposto;
	}
	
	Motos(int id, int cilindrada, int imposto) {
		this.id = id;
		this.cilindrada = cilindrada;
		this.imposto = imposto;
	}

	public int calculaAluguel() {
		aluguel = new Random().nextInt(cilindrada);
		return aluguel;
	}
	
	public int calculaDiaria() {
		diaria = imposto*aluguel;
		return diaria;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getAluguel() {
		return aluguel;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public int getDiaria() {
		return diaria;
	}

	public void setDiaria(int diaria) {
		this.diaria = diaria;
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
		return "Moto\n" + "Id: " + this.id + "\tCilindrada: " + 
				this.cilindrada + "\nImposto: " + this.imposto + "\tAluguel: " +
				this.aluguel + "\nDiária: " + this.diaria + "\nDisponibilidade: " + this.disponibilidade;
	}
}

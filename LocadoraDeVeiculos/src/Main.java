
public class Main {
	public static void main(String[] args) {
		Caminhao truck1 = new Caminhao(21, 3, 100);
		Caminhao truck2 = new Caminhao(555, 5, 100);
		
		CarroPasseio car1 = new CarroPasseio(222, 70);
		CarroPasseio car2 = new CarroPasseio(321, 70);
		
		Utilitarios util1 = new Utilitarios(777, 90);
		Utilitarios util2 = new Utilitarios(752, 90);
		
		Motos moto1 = new Motos(921, 200, 50);
		Motos moto2 = new Motos(999, 50);
		
		Gerenciador gerenciador = new Gerenciador();
		
		
		//Cálculo dos alugueis
		truck1.calculaAluguel();
		truck2.calculaAluguel();
		car1.calculaAluguel();
		car2.calculaAluguel();
		util1.calculaAluguel();
		util2.calculaAluguel();
		moto1.calculaAluguel();
		moto2.calculaAluguel();
		
		gerenciador.alugarVeiculo(truck2);
		
		gerenciador.ImprimeDados(truck1);
		gerenciador.ImprimeDados(truck2);
		gerenciador.ImprimeDados(car1);
		gerenciador.ImprimeDados(car2);
		gerenciador.ImprimeDados(util1);
		gerenciador.ImprimeDados(util2);
		gerenciador.ImprimeDados(moto1);
		gerenciador.ImprimeDados(moto2);
		
		//Impressão das diárias
		gerenciador.ImprimeDiaria(truck1);
		gerenciador.ImprimeDiaria(truck2);
		gerenciador.ImprimeDiaria(car1);
		gerenciador.ImprimeDiaria(car2);
		gerenciador.ImprimeDiaria(util1);
		gerenciador.ImprimeDiaria(util2);
		gerenciador.ImprimeDiaria(moto1);
		gerenciador.ImprimeDiaria(moto2);
		
		System.out.println("Disponibilidade truck2: " + truck2.getDisponibilidade());
		
	}
}

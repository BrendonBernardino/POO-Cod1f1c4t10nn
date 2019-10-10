import java.util.*;
public class Agenda {
	private ArrayList <Contato> listaCont = new ArrayList<Contato>();
	
	Agenda() {
		
	}
	
	Agenda(ArrayList <Contato> listaCont) {
		this.listaCont = listaCont;
		this.listaCont = new ArrayList<Contato>();
	}
	
	boolean adicionarContato(Contato contato) {
		//Testar contato se já existe;
		//Testar se contato é vazio;
		if(contato.getNome() != null && !contato.getListaTel().isEmpty()) {
			this.listaCont.add(contato);
			return true;
		}
		return false;
	}
	
	boolean removerContato(Contato contato) {
		if(contato.getNome() != null && !contato.getListaTel().isEmpty()) {
			if(contato != null) {
				this.listaCont.remove(contato);
				return true;
			}
		}
		return false;
	}
	
	boolean alterarContato(Contato contato, String nome, String email) {
		if(contato.getNome() != null && contato.getEmail() != null) {
				if(nome != null)
				contato.setNome(nome);;
				
				if(email != null)
				contato.setEmail(email);
				
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String aux = "";
		for(int i = 0; i < this.listaCont.size(); i++) {
			aux = aux + this.listaCont.get(i).toString()+"\n";
		}
		return aux;
	}
}

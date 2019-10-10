import java.util.*;
public class Contato {
	private String nome;
	private String email;
	private ArrayList <Telefone> listaTel = new ArrayList<Telefone>();
	
	Contato(String nome, Telefone telefone) {
		this.nome = nome;
		this.listaTel = new ArrayList<Telefone>();
		this.listaTel.add(telefone);
	}
	
	Contato(String nome, String email, Telefone telefone) {
		this.nome = nome;
		this.email = email;
		this.listaTel = new ArrayList <Telefone>();
		this.listaTel.add(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Telefone> getListaTel() {
		return listaTel;
	}

	public void setListaTel(ArrayList<Telefone> listaTel) {
		this.listaTel = listaTel;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nE-mail: " + this.email + "\nTelefone: " + this.listaTel;
	}
	
	boolean adicionarTelefone(Telefone telefone) {
		if(telefone.getDdd() > 0 && telefone.getDdd() <= 999) {
			if(telefone.getNumero() > 0) {
				this.listaTel.add(telefone);
				return true;
			}
		}
		return false;
	}
}

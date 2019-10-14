public class Cliente {
	String nome;
	int id;
	
	Cliente() {
		
	}
	
	Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id:" + this.id + " Nome:" + this.nome;
	}
	
}

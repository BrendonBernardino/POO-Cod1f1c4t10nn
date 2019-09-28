
public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anopublic;
	private int isbn;
	
	Livro(){
		
	}
	
	Livro(String titulo, String autor, String editora, int anopublic, int isbn){
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anopublic = anopublic;
		this.isbn = isbn;
	}
	
	String getTitulo(){
		return this.titulo;
	}
	
	void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	String getAutor(){
		return this.autor;
	}
	
	void setAutor(String autor){
		this.autor = autor;
	}
	
	String getEditora(){
		return this.editora;
	}
	
	void setEditora(String editora){
		this.editora = editora;
	}
	
	int getAnopublic(){
		return this.anopublic;
	}
	
	void setAnopublic(int anopublic){
		this.anopublic = anopublic;
	}
	
	int getIsbn(){
		return this.isbn;
	}
	
	void setIsbn(int isbn){
		this.isbn = isbn;
	}
	
	public static void main(String[] args){
		Livro livro1, livro2;
		livro1 = new Livro();
		livro2 = new Livro("O conto de Aia","ABC","XYZ",2017, 12345);
		System.out.println("Título Livro 1: " + livro1.getTitulo());
		System.out.println("Título Livro 2: " + livro2.getTitulo());
		System.out.println("Autor Livro 2: " + livro2.getAutor());
		System.out.println("Editora Livro 2: " + livro2.getEditora());
		System.out.println("Ano de publicação Livro 2: " + livro2.getAnopublic());
		System.out.println("ISBN Livro 2: " + livro2.getIsbn());
		
		Livro livro3 = new Livro();
		livro3 = livro2;
		System.out.println("Título Livro 2: " + livro2.getTitulo());
		System.out.println("Autor Livro 2: " + livro2.getAutor());
		System.out.println("Editora Livro 2: " + livro2.getEditora());
		System.out.println("Ano de publicação Livro 2: " + livro2.getAnopublic());
		System.out.println("ISBN Livro 2: " + livro2.getIsbn());
		
		System.out.println("Título Livro 3: " + livro3.getTitulo());
		System.out.println("Autor Livro 3: " + livro3.getAutor());
		System.out.println("Editora Livro 3: " + livro3.getEditora());
		System.out.println("Ano de publicação Livro 3: " + livro3.getAnopublic());
		System.out.println("ISBN Livro 3: " + livro3.getIsbn());
		
		livro2 = livro1;
		System.out.println("Título Livro 1: " + livro1.getTitulo());
		System.out.println("Autor Livro 1: " + livro1.getAutor());
		System.out.println("Editora Livro 1: " + livro1.getEditora());
		System.out.println("Ano de publicação Livro 1: " + livro1.getAnopublic());
		System.out.println("ISBN Livro 1: " + livro1.getIsbn());
		
		System.out.println("Título Livro 2: " + livro2.getTitulo());
		System.out.println("Autor Livro 2: " + livro2.getAutor());
		System.out.println("Editora Livro 2: " + livro2.getEditora());
		System.out.println("Ano de publicação Livro 2: " + livro2.getAnopublic());
		System.out.println("ISBN Livro 2: " + livro2.getIsbn());
	}

}

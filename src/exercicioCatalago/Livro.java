package exercicioCatalago;

public class Livro extends Item {
	
	private String autor;
	private int paginas;
	
	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		String livro = "";
		
		livro += "Nome do livro -> " + super.getNome() + "\n";
		livro += "Categoria -> " + super.getCategoria() + "\n";
		livro += "Nome do Autor -> " + this.getAutor() + "\n";
		livro += "Número de páginas -> " + this.getPaginas() + "\n";
		
		return livro;
		
		
	}
	
	
}
	
	
	
	



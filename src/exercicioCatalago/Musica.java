package exercicioCatalago;

public class Musica extends Item {
	 
	private String cantor;
	private String banda;
	private String genero;
	
	public Musica(String nome, String categoria, String cantor, String banda, String genero) {
		super(nome, categoria);
		this.cantor = cantor;
		this.banda = banda;
		this.genero = genero;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		String musica = "";
		
		musica += "Nome da musica -> " + super.getNome() + "\n";
		musica += "categoria -> " + super.getCategoria() + "\n";
		musica += "nome do cantor -> " + this.getCantor() + "\n";
		musica += "nome da banda -> " + this.getBanda() + "\n";
		musica += "Gênero musical -> " + this.getGenero() + "\n";
		
		return musica;
	}
	
	
	

}

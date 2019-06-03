package exercicioCatalago;

import java.util.List;

public class Filme extends Item {
	 
	
	private String genero;
	private int duracao;
	private List<String> atores;
	
	public Filme(String nome, String categoria, String genero, int duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}
	
	@Override
	public String toString() {
		String filme = "";
		
		filme += " Nome do filme -> " + super.getNome() + "\n";
		filme += "Categoria -> " + super.getCategoria() + "\n";
		filme += " Gênero do filme -> " + this.getGenero() + "\n";
		filme += "Duração do filme -> " + this.getDuracao() + "\n";
		filme += "Elenco do filme -> " + this.getAtores() + "\n";
		
		return filme;
	}
	
	
	
	
    
}

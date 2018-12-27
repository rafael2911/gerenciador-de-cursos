package br.com.alura.gerenciador.model;

public class Aula implements Comparable<Aula> {
	
	private String nome;
	private int duracao;
	
	public Aula(String nome, int duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getDuracao() {
		return duracao;
	}

	@Override
	public int compareTo(Aula a2) {
		return this.nome.compareTo(a2.getNome());
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.nome + ", Duração: " + this.duracao + "]";
	}
}

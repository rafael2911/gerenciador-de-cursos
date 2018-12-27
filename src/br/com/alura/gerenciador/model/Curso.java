package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private List<Aula> aulas;
	
	public Curso(String nome) {
		this.nome = nome;
		this.aulas = new ArrayList<>();
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public int getDuracaoTotal() {
		return this.aulas.stream().mapToInt(Aula::getDuracao).sum();
	}
	
	public String getNome() {
		return nome;
	}

}

package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private List<Aula> aulas;
	private int duracaoTotal;
	
	public Curso() {
		this.aulas = new ArrayList<>();
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

}

package br.com.alura.gerenciador.teste;

import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TestaListaCurso {
	
	public static void main(String[] args) {
		
		
		Curso curso = new Curso("Dominando as Collections", "Paulo Silveira");
//		List<Aula> aulas = curso.getAulas();
//		
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Listas de Objetos", 19));
		curso.adiciona(new Aula("Relacionamentos com coleções", 24));
		
		System.out.println(curso.getAulas());
		
	}
	
}

package br.com.alura.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TesteSortListaImutavel {

	public static void main(String[] args) {
		
		
		Curso curso = new Curso("Dominando as Collections", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Listas de Objetos", 19));
		curso.adiciona(new Aula("Relacionamentos com coleções", 24));
		
		System.out.println("Antes da ordenação:");
		System.out.println(curso.getAulas());
		
		List<Aula> aulasImutaveis = curso.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println();
		System.out.println("Após ordenação:");
		System.out.println(aulas);
		
		
		
		// imprimindo usando o método toString
		System.out.println();
		System.out.println("Imprimindo um curso:");
		System.out.println(curso);
		
	}
	
}

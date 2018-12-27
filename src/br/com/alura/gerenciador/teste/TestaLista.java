package br.com.alura.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.gerenciador.model.Aula;

public class TestaLista {
	
	public static void main(String[] args) {
		
		List<Aula> cursos = new ArrayList<>();
		cursos.add(new Aula("Instalando o git", 15));
		cursos.add(new Aula("Branch, README e Commit", 20));
		cursos.add(new Aula("Iniciando um repositório", 12));
		cursos.add(new Aula("O que é, para que serve e como funciona?", 19));
		
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		cursos.forEach(aula -> System.out.println(aula.getNome()));
		
	}
	
}

package br.com.alura.gerenciador.teste;

import java.util.List;

import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Git - Versionamento de código");
		curso.adiciona(new Aula("Instalando o git", 15));
		curso.adiciona(new Aula("Branch, README e Commit", 20));
		curso.adiciona(new Aula("Iniciando um repositório", 12));
		curso.adiciona(new Aula("O que é, para que serve e como funciona?", 19));
		
		List<Aula> aulas = curso.getAulas();
		
		System.out.println(aulas);
		System.out.println(curso.getDuracaoTotal());
		
	}
	
}

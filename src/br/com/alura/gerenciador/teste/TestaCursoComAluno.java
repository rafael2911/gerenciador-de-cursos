package br.com.alura.gerenciador.teste;

import java.util.Collections;
import java.util.Set;

import br.com.alura.gerenciador.model.Aluno;
import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rafael", 1001);
		Aluno a2 = new Aluno("Antonio", 1002);
		Aluno a3 = new Aluno("Joana", 1003);
		Aluno a4 = new Aluno("Daniela", 1004);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
//		Set<String> nomes = Collections.emptySet();
//		// Não compila, pois um conjunto vazio não pode conter elementos.
//		nomes.add("Teste empty set");
//		
//		System.out.println("Testanto empty set!!!");
//		System.out.println(nomes);
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
		System.out.println("");
		System.out.println("Conjuntos Sincronizados");
		alunosSincronizados.forEach(a -> System.out.println(a));
		
	}
	
}

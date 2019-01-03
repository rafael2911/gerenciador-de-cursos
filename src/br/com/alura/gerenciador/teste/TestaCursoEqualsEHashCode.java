package br.com.alura.gerenciador.teste;

import br.com.alura.gerenciador.model.Aluno;
import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TestaCursoEqualsEHashCode {
	
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
		
//		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno rafael = new  Aluno("Rafael", 0);
		
		System.out.println(javaColecoes.estaMatriculado(rafael));
		
	}
	
}

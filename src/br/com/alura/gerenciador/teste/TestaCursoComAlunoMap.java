package br.com.alura.gerenciador.teste;

import java.util.Map;

import br.com.alura.gerenciador.model.Aluno;
import br.com.alura.gerenciador.model.Aula;
import br.com.alura.gerenciador.model.Curso;

public class TestaCursoComAlunoMap {
	
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
		
		Aluno aluno = javaColecoes.buscaMatriculado(1003);
		
		System.out.println(aluno);
		
		// iterando nas chaves
		Map<Integer, Aluno> matriculaParaAluno = javaColecoes.getMatriculaParaAluno();
		
		System.out.println("");
		System.out.println("Iterando as chaves:");
		matriculaParaAluno.keySet().forEach(chave -> {
			System.out.println(chave);
		});
		
		System.out.println("");
		System.out.println("Iterando os valores:");
		matriculaParaAluno.values().forEach(valor -> {
			System.out.println(valor);
		});
		
		System.out.println("");
		System.out.println("Iterando as associações:");
		matriculaParaAluno.entrySet().forEach(assoc -> {
			System.out.println(assoc);
		});
		
//		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
	}
	
}

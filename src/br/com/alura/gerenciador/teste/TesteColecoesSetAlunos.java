package br.com.alura.gerenciador.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteColecoesSetAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        alunos.add("Rafael");
        alunos.add("Antonio");
		
        System.out.println(alunos);
        System.out.println(alunos.size());
        
        alunos.add("Pedro");
        alunos.add("Rafael");
        
        System.out.println("Após adicionar dois itens duplicados!!!");
        System.out.println(alunos.size());
        
	}
	
}

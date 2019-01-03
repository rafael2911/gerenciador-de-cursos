package br.com.alura.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaString {
	
	public static void main(String[] args) {
		
		String aula1 = "Trabalhando com ArrayList";
		String aula2 = "Listas de objetos";
		String aula3 = "Relacionamentos com coleções";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		aulas.remove(aula2);
		aulas.add("Aplicando o Set no modelo");
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
	}
	
}

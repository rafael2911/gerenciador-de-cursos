package br.com.alura.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	
	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<>();
		cursos.add("Instalando o git");
		cursos.add("Branch, README e Commit");
		cursos.add("Iniciando um reposit�rio");
		cursos.add("O que �, para que serve e como funciona?");
		
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
	}
	
}

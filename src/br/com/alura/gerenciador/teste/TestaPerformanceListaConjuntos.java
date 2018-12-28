package br.com.alura.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceListaConjuntos {
	
	public static void main(String[] args) {
		
		Collection<Integer> inteiros = new HashSet<>();
		//Collection<Integer> inteiros = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i=0; i<5000; i++) {
			inteiros.add(i+999);
		}
		
		for (Integer inteiro : inteiros) {
			inteiros.contains(inteiro);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempoDeExecucao);
		
	}
	
}

package br.com.alura.gerenciador.teste;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.gerenciador.model.Recibo;

public class TestaReciboTreeSet {
	
	public static void main(String[] args) {
		
		Recibo r1 = new Recibo("cTeste recibo 1");
		Recibo r2 = new Recibo("kTeste recibo 2");
		Recibo r3 = new Recibo("bTeste recibo 3");
		Recibo r4 = new Recibo("jTeste recibo 4");
		Recibo r5 = new Recibo("aTeste recibo 5");
		Recibo r6 = new Recibo("eTeste recibo 6");
		
		// passando um comparator dentro do construtor (utilizando uma classe anônima)
		Set<Recibo> recibos = new TreeSet<>(new Comparator<Recibo>() {

			@Override
			public int compare(Recibo r1, Recibo r2) {

				return r1.getMensagem().compareTo(r2.getMensagem());
			}
			
		});
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);
		recibos.add(r4);
		recibos.add(r5);
		recibos.add(r6);
		
		for(Recibo recibo : recibos) {
			System.out.println(recibo.getMensagem());
		}
	}
	
}

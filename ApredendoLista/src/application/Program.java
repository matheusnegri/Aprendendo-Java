package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criando a lista
		List<String> lista = new ArrayList();
		
		lista.add("Teste");
		lista.add("João");
		lista.add("Matheus");
		lista.add("Adrielle");
		lista.add("Márcio");
		lista.add("Teste");
		lista.add("Alface");
		lista.add("Tomate");
		lista.add("Júnior");
		
		//Mostrando o tamanho (posições) da lista
		System.out.println(lista.size());
		
		for (String teste : lista) {
			System.out.println(teste);
		}
		
		//Removendo valores que iniciam com a letra M
		lista.removeIf(teste -> teste.charAt(0) == 'M');
		
		System.out.println();
		
		for (String teste : lista) {
			System.out.println(teste);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Adrielle: " + lista.indexOf("Adrielle"));

		System.out.println("---------------------");
		//armazenando todas as strings que iniciam com a letra A
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String teste : result) {
			System.out.println(teste);
		}
		
		//Armazenando na variável name o a primeira palavra encontrada com a inicial J
		String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Não tem");
		System.out.println(name);
	
	sc.close();
	}

}

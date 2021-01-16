package blackboard;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Aumentando o nosso Conhecimento";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
	
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for ( int i=0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		System.out.println(aulas.size());
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		/* "foreach" */
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
			
		}
		aulas.add(aula4);
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: ");
		System.out.println(aulas);
 
	}

}

package blackboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entities.Filme;

public class Main3 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Filme f1 = new Filme("O Rei Leão 2020", sdf.parse("22/01/2020"));
		Filme f2 = new Filme("Tittanic", sdf.parse("16/01/1998"));
		Filme f3 = new Filme("O Mentiroso", sdf.parse("30/05/1997"));
		Filme f4 = new Filme("Nemo", sdf.parse("04/07/2003"));
		
		ArrayList<Filme> filmes = new ArrayList<>();
		
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);
		filmes.add(f4);
		
		
		Collections.sort(filmes);
		
		for (Filme filme : filmes) {
			System.out.println(filme);
		}
		filmes.sort(Comparator.comparing(Filme::getDatadeLancamento));
		System.out.println();
		for (Filme filme : filmes) {
			System.out.println(filme);
		}
	}

}

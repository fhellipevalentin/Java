package blackboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Film;

public class Main {
	
	public static void main(String[] args) throws ParseException{
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		String name = "O Rei Leão";
		Date date = sdf.parse("28/10/2020");
		
		Film film = new Film(date, name);
		
		System.out.println(film);
		
	}
}

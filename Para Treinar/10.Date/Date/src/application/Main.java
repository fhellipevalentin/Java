package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Curso;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		String name = "Matematica";
		Date date = sdf.parse("23/11/2015");
		
		Curso curso = new Curso(name, date);
		
		System.out.println(curso);
		
	}

}

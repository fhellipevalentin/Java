package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");//instancia um arquivo em determinado local
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);//Scanner l� o arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());//printa na tela o que abriu (texto)
			}
		}
		catch  (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		//finally � um bloco que executa de qualquer jeito, independente 
		//do poss�vel acionamento da exce��o
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
		
	}

}

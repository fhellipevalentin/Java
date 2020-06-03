package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorApp;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		VectorApp [] vect = new VectorApp[10];
		for (int i=0; i<n; i++) {
				sc.hasNextLine();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				vect[room] = new VectorApp(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {	
				System.out.println(i + ":" + vect[i]);
			}
			else {
			}
		}
		
		sc.close();
	}

}

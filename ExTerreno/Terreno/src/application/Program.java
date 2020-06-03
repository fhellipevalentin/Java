package application;

import java.util.Scanner;
import entities.Area;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		area.width = sc.nextDouble();
		area.height = sc.nextDouble();
		area.squareMeter = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", area.area());
		System.out.printf("PRICE: %.2f%n", area.preco());
		
		
		
		sc.close();

	}

}

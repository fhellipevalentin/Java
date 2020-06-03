package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor de entrada: ");
		for (int i=1; i<=3; i++) {
			double altura = sc.nextDouble();
			if (altura < 1.80) {
				System.out.printf("Altura %.2f permitida",altura);
			}
			else {
				System.out.printf("Altura %.2f excede o permitido ",altura);
			}
			System.out.println();
			System.out.print("Digite o próximo valor a ser carregado: ");
		}
		sc.close();

	}

}

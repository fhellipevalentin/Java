package application;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer vect [] = new Integer[n];
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			System.out.print(vect[i]);
		}
		sc.close();

	}

}

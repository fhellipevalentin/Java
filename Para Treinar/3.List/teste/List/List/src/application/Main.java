package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		sc.nextLine();
		String add1 = sc.nextLine();
		String add2 = sc.nextLine();
		list.add(add1);
		list.add(add2);
		
		for (String x : list) {
			System.out.println(x);
		}
		sc.close();
	
	}

}
package blackboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.User;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<User> list = new ArrayList<>();
		// PART 1 - READING DATA:
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new User(id, name, salary));
		}
		// UPDATING SALARY OF GIVEN EMPLOYEE:
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		User usr = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (usr == null) {
			System.out.println("This ID doesn't exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			usr.increaseSalary(percentage);
		}
		// LISTING EMPLOYEES
		System.out.println();
		System.out.println("List of employees: ");
		for (User x : list) {
			System.out.println(x);
		}
			
		sc.close();
	}

}

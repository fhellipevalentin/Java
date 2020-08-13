package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> list = new ArrayList <>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Individual individual = new Individual(name, anualIncome, healthExpenditures);
				list.add(individual);  
			}
			else {
				System.out.print("Number Of Employees: ");
				int numberOfEmployees = sc.nextInt();
				Company company = new Company(name, anualIncome, numberOfEmployees);
				list.add(company);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:"); 
		for (Taxpayer taxpayer : list) {
			
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
		}
		
		//Alex: $ 11500.00 SoftTech: $ 56000.00 Bob: $ 29500.00
		//TOTAL TAXES: $ 97000.00

		
		
		sc.close();
	}

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss"
				+ "");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		//parse � um comando para converter o que o usu�rio digitar para Date
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		//a fun��o value.Of converte o String para o valor  correspondente definido ao OrderStatus
		OrderStatus status = OrderStatus.valueOf(sc.next());
		//instancia de Order associado com cliente
		Order order = new Order(new Date(), status, client);//new Date()=hora do instante
		
		System.out.print("How many items to this worker? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #"+ i +" item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			//associando pedido com produto:
			OrderItem it = new OrderItem(quantity, productPrice, product);
			//associando item de pedido com pedido atrav�s da List
			order.addItem(it);
		}
		System.out.println();
		System.out.println(order);
		sc.close();
	}

}
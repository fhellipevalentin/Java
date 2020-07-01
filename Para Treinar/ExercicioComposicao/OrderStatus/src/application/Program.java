package application;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product p = new Product("TV", 1000.00);
		
		OrderItem od1 = new OrderItem(25, 1000.0, p);
		
		System.out.println(od1.getProduct().getName());
	}

}

package application;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		//duas conex�es realizadas
		Product p = new Product("TV", 1000.00);
		OrderItem od1 = new OrderItem(25, 1000.0, p);
		
		//print na tela da conex�o OrderItem com Produtos e de Produtos com seus objetos
		System.out.println(od1.getProduct().getName() +" "+ od1.getPrice());
	}

}

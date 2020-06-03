package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;

	public double totalvalueInStock () {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity; //quantity da classe recebendo da variável
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}

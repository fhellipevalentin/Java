package entities;

public class Area {
	
	public double width;
	public double height;
	public double squareMeter;
	
	public double area() {
		return width * height;
	}
	public double preco() {
		return area() * squareMeter;
	}

}

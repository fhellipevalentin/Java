package entities;

import java.util.Date;

public class Client {
	
	private String name;
	private double email;
	private Date bithDate;
	
	public Client () {
		
	}
	
	public Client(String name, double email, Date bithDate) {

		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmail() {
		return email;
	}

	public void setEmail(double email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
	
	
}


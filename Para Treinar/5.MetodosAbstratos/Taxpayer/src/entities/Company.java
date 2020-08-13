package entities;

public class Company extends Taxpayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		return condition();
	}
	
	public Double condition() {
		double result = 0;
		
		if (getNumberOfEmployees() > 10) {
			result = getAnualIncome() * 0.14;
		}
		else {
			result = getAnualIncome() * 0.16;
		}
		return result;
	}
}

package entities;
import entities.Taxpayer;

public class Individual extends Taxpayer{
	
	private Double healthExpenditures;
	
	public Individual () {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHeathExpenditures() {
		return healthExpenditures;
	}

	public void setHeathExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		
		return condition();
	}
	
	public Double condition() {
		double result = 0;
		
		if (getAnualIncome() <= 15000) {
			result = (getAnualIncome() * 0.15) - (healthExpenditures / 2 );
		}
		else {
			result = (getAnualIncome() * 0.25) - (healthExpenditures / 2 );
		}
		return result;
	}
	
	//(50000 * 25%) - (2000 * 50%)
	
}

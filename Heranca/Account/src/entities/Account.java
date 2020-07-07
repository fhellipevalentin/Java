package entities;

public class Account {
		private Integer number;
		private String holder;
		private Double balance;
		
		public Account() {
			
		}

		public Account(Integer number, String holder, Double balance) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}
		//m�todo de saque
		public void withdraw(double amount) {
			balance -= amount;
		}
		//m�todo de dep�sito
		public void deposit(double amount) {
			balance += amount;
		}
}

package entities;
//extends é o comando que possibilita usar todos os atributos de outra classe
public class BusinessAccount extends Account{//BusinessAccount sendo subclasse de Account
		
		private Double loanLimit;
		
		public BusinessAccount() {
			super();
		}

		public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
			super(number, holder, balance);
			this.loanLimit = loanLimit;
		}

		public Double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(Double loanLimit) {
			this.loanLimit = loanLimit;
		}
		//método de empréstimo
		public void loan (double amount) {
			if  (amount <= loanLimit) {
				deposit(amount);
			}
		}
}

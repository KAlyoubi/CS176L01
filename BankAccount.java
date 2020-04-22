class BankAccount implements Measurable{
	
	private double Balance;

	public BankAccount(){
		
		Balance = 0;
	}

	public BankAccount(double InitialBalance){
		
		Balance = InitialBalance;
	}

	public void deposit(double Amount){
		
		double NewBalance = Balance + Amount;
		
		Balance = NewBalance;
	}

	public void withdraw(double Amount){
		
		double NewBalance = Balance - Amount;
		
		Balance = NewBalance;
	}


	public double getBalance(){
		
		return Balance;
	}
	
	public double getMeasure(){
		
		return Balance;
	}
}
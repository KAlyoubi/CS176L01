package CashRegister;

import java.text.NumberFormat;

public class CashRegisterV2 {


	private double Purchase;
	
	private double Payment;
	
	private double Aiscount;
	
	private double Discounted;
	
	private double NewAmount;
	
	NumberFormat Formatter = NumberFormat.getCurrencyInstance();

	public CashRegisterV2() {
		
		Purchase = 0;
		
		Payment = 0;
	}

	public void recordPurchase(double amount) {
		
		Purchase = Purchase + amount;
	}
	public void calcDiscount (final double THRESHOLD, final double DISCOUNT) {
		
		if(Purchase >= THRESHOLD) {
			
			Discounted = DISCOUNT * Purchase;
			
			NewAmount = Purchase - Discounted;
			
			System.out.println("Your total purchases are " + Formatter.format(Purchase) + " because you spent over " + Formatter.format(THRESHOLD) + " you are eligible for a " + (DISCOUNT * 100) + "% " + " discount of " + Formatter.format(Discounted) + " so your new balance is " + Formatter.format(NewAmount));
		}
	}

	public void receivePayment(double moneyGiven) {
		
		Payment = Payment + moneyGiven;
	}
	public double giveChange() {

		return (Payment - Purchase);

	}
	public void printChange() {
		
		System.out.print("Your change is: " + Formatter.format((giveChange())));


	}




}

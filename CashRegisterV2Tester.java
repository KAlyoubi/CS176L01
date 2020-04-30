package CashRegister;

import java.util.Scanner;

public class CashRegisterV2Tester {

	public static void main(String[] args) {

		CashRegisterV2 Register = new CashRegisterV2();

		Scanner in = new Scanner(System.in);

		final double SENTINEL = -1;

		final double DISCOUNT = 0.10;

		final double THRESHOLD = 50;

		System.out.print("Please enter a purchase amount or -1 to stop: ");

		while(in.hasNextDouble()) {

			double Amount = in.nextDouble();

			if(Amount == SENTINEL) {
				break;
			}
			System.out.print("Please enter a purchase amount or -1 to stop: ");
			Register.recordPurchase(Amount);

		}
		Register.calcDiscount(THRESHOLD, DISCOUNT);
		System.out.print("Please enter a your payment amount: ");
		double amountPaid = in.nextDouble();
		Register.receivePayment(amountPaid);
		Register.giveChange();
		Register.printChange();




	}


}


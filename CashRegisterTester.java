
import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CashRegister Cashier = new CashRegister();

		final double sentinel = -1;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a purchase amount or - 1 to stop: ");
		

		while(scan.hasNextDouble()) {
			double costPurchase = scan.nextDouble();
			if(costPurchase == sentinel){
				break;
			}//if
			
			
			System.out.print("Enter a purchase amount or - 1 to stop: ");
			Cashier.recordPurchase(costPurchase);
		}//while
		
		
		System.out.print("Enter a payment amount: ");
		double amount = scan.nextDouble();
		Cashier.receivePayment(amount);
		Cashier.giveChange();
		Cashier.printChange();

	}//main


}//class

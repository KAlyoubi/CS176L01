package VenueProject;

import java.util.Random;

public class VenueTester {

	public static void main(String[] args) {

		Random generator = new Random(); 

		Venue prudentialCenter = new Venue(4, 5, 10);

		for(int i = 0; i < 100; i++) {

			int n1 = generator.nextInt(4);

			int n2 = generator.nextInt(5);

			int n3 = generator.nextInt(10);


			if(prudentialCenter.seatLookup(n1, n2, n3) == true) {
				System.out.println("Section: " + n1 +", Row: "+ n2 +", Seat: "+ n3 + " is taken");
			}

			else {
				System.out.println("Section: " + n1 +", Row: "+ n2 +", Seat: "+ n3 + " is awarded");
			}


		}

		prudentialCenter.seatLookup(1, 2, 4);
	}

}
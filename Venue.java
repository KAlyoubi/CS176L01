package VenueProject;

import java.util.ArrayList;

public class Venue {
	private boolean[][][] AllSeats;

	public Venue(int Section, int Row, int Seat) {
		AllSeats = new boolean[Section][Row][Seat];

		for(int i = 0; i < Section; i++) {

			for(int j = 0; j < Row; j++) {

				for(int k = 0; k < Seat; k++) {
					AllSeats[i][j][k] = false;

				}
			}
		}
	}
	
	public boolean seatLookup(int Sections, int Rows, int Seats) {

		if(AllSeats[Sections][Rows][Seats] == false) {
			AllSeats[Sections][Rows][Seats] = true;
			return true;
		}
		
		else {
			System.out.print("The seat is open ");
			return false;
		}
	}

}
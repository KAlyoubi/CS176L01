package MP2A;

import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);

	int ArraySize = 0;

	String [] UserArray;

	public Class1(int Size) {
		ArraySize = Size;
	}

	public void load() {

		String [] Strings = new String[ArraySize];

		System.out.print("Please enter a string or type 'Done' to quit: ");

		ArraySize = 0;

		for (int j = 0; j < Strings.length; j++) {
			Strings[j] = in.nextLine();

			if(Strings[j].equals("Done")) {
				break;
			}

			System.out.print("Please enter a string or type 'Done' when finished: ");
			ArraySize++;
		}

		UserArray = new String[ArraySize];

		for (int j = 0; j < ArraySize; j++) {
			UserArray[j] = Strings[j];
		}
	}

	public boolean search(String In) {

		boolean IfIn = false;

		for (int j = 0; j < ArraySize; j++) {

			if (In.equals(UserArray[j])) {
				IfIn = true;
			}
		}

		return IfIn;
	}

	public String FindMaximum() {

		String Highest = UserArray[0];

		int lexicographic = 0;

		for (int j = 0; j < ArraySize - 1; j++) {

			if (Highest.compareTo(UserArray[j+1]) == lexicographic) {
				Highest += ", " + UserArray[j+1];
			}

			if (Highest.compareTo(UserArray[j+1]) > lexicographic) {
				lexicographic = Highest.compareTo(UserArray[j+1]);
				Highest = UserArray[j];
			}
		}

		return Highest;
	}

	public String FindMinimum() {

		String Lowest = UserArray[0];

		int Definer = 0;

		for (int j = 0; j < ArraySize - 1; j++) {

			if (Lowest.compareTo(UserArray[j+1]) == Definer) {
				Lowest += ", " + UserArray[j+1];
			}

			if (Lowest.compareTo(UserArray[j+1]) < Definer) {
				Definer = Lowest.compareTo(UserArray[j+1]);
				Lowest = UserArray[j];
			}
		}

		return Lowest;
	}

	public String FindLongest() {

		String Longest = null;

		int Cmpr = Integer.MIN_VALUE;

		for (int j = 0; j < ArraySize; j++) {

			if (UserArray[j].length() == Cmpr) {
				Longest += ", " + UserArray[j];
			}

			else if (UserArray[j].length() >= Cmpr) {
				Longest = UserArray[j];
				Cmpr = UserArray[j].length();
			}
		}

		return Longest;
	}

	public String FindShortest() {

		String Shortest = null;

		int compare = Integer.MAX_VALUE;

		for (int j = 0; j < ArraySize; j++) {

			if (UserArray[j].length() == compare) {
				Shortest += ", " + UserArray[j];
			}

			else if (UserArray[j].length() <= compare) {
				Shortest = UserArray[j];
				compare = UserArray[j].length();
			}
		}

		return Shortest;
	}

}
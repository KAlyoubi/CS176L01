package MP2A;

import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);

	int Count = 0;

	int ArrayLength = 0;

	String [] UserArray;

	public Class1(int Length) {
		ArrayLength = Length;
	}

	public void load() {

		String [] Strings = new String[ArrayLength];

		System.out.print("Please enter a string or type 'Done' when finished: ");

		ArrayLength = 0;

		String input;


		boolean Done = false;

		while(Done == false) {
			input = scan.next();
			if(input.equals("Done")) {
				Done = true;
				Count--;
			}
			else {
				Strings[Count] = input;
				Count++;


				System.out.print("Please enter a string or type 'Done' when finished: ");
				ArrayLength++;
			}
		}
		UserArray = new String[ArrayLength];

		for (int j = 0; j < ArrayLength; j++) {
			UserArray[j] = Strings[j];
		}

	}

	public boolean search(String In) {

		boolean IfIn = false;

		for (int j = 0; j <= Count; j++) {

			if (UserArray[j].contentEquals(In)) {
				IfIn = true;
			}
		}

		return IfIn;
	}

	String Highest = "";

	public String FindMaximum() {
		for(int j = 0; j <= Count; j++) {
			if(j == 0) {
				Highest = UserArray[j];
			}
			else{
				if(UserArray[j].compareTo(Highest) > 0) {
					Highest = UserArray[j];
				}
			}
		}
		return Highest;
	}
	String Lowest = "";

	public String FindMinimum(){
		for(int j = 0; j <= Count; j++) {
			if(j == 0) {
				Lowest = UserArray[j];
			}
			else {
				if(UserArray[j].compareTo(Lowest) < 0) {
					Lowest = UserArray[j];
				}
			}
		}
		return Lowest;
	}

	public String FindLongest() {

		String Longest = null;

		int compare = Integer.MIN_VALUE;

		for (int j = 0; j < Count; j++) {

			if (UserArray[j].length() == compare) {
				Longest += ", " + UserArray[j];
			}

			else if (UserArray[j].length() >= compare) {
				Longest = UserArray[j];
				compare = UserArray[j].length();
			}
		}

		return Longest;
	}

	public String FindShortest() {

		String Shortest = null;

		int compare = Integer.MAX_VALUE;

		for (int j = 0; j < Count; j++) {

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
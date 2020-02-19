package MP2B;

import java.util.Scanner;

public class Class2 {

	Scanner scan = new Scanner(System.in);

	final int MAXIMUM_Size = 100;

	int Inputs = 0;

	int UserArray = 0;

	int Maximum = 0;

	int Minimum = 0;

	int [] integers;

	public Class2() {
		integers = new int[MAXIMUM_Size];
	}
	public void load () {
		System.out.println("Please enter integers and '-999' to finish: ");

		while (scan.hasNextInt()) {

			Inputs = scan.nextInt();

			if (Inputs == -999) {
				break;
			} 

			else {

				integers[UserArray] = Inputs;
				UserArray++;
			}

		}

	}


	public boolean search(int Num) {

		boolean Find = false;

		for (int i = 0; i < UserArray; i++) {

			if(integers[i] == Num)
				Find = true;
		}

		return Find;
	}

	public  int FindMaximum() {

		Maximum = 0;

		for (int i = 0; i <= UserArray; i++) {

			if (i == 0)
				Maximum = integers[i];

			else {

				if (integers[i] > Maximum)
					Maximum = integers[i];
			}

		} 

		return Maximum;
	}

	public int FindMinimum() {

		Minimum = 0;

		for (int i = 0; i < UserArray; i++) {

			if (i == 0)
				Minimum = integers[i];

			else {

				if (integers[i] < Minimum)
					Minimum = integers[i];
			}

		} 

		return Minimum;
	}

	public int FindMaxPos() {

		int Max = Integer.MIN_VALUE;

		int MaxPos = 0;

		for (int i = 0; i < integers.length; i++) {

			if (integers[i] > Max) {
				Max = integers[i];
				MaxPos = i;
			}
		}
		
		return MaxPos;
	}
	
	public int FindMinPos() {
		
		int Min = Integer.MAX_VALUE;
		
		int MinPos = 0;
		
		for (int i = 0; i < integers.length; i++) {
		
			if (integers[i] > Min) {
				Min = integers[i];
				MinPos = i;
			}
			
		}
		return MinPos;
	}

}
package MP2B;

import java.util.Scanner;

public class Class2 {

	Scanner scan = new Scanner(System.in);

	final int MAXIMUM_Size = 100;

	int Inputs = 0;

	int Count = 0;

	int Maximum = 0;

	int Minimum = 0;

	int [] integers;

	public Class2() {
		integers = new int[MAXIMUM_Size];
	}
	public void load () {
		System.out.println("Please enter integers and '-1' to finish: ");

		while (scan.hasNextInt()) {

			Inputs = scan.nextInt();

			if (Inputs == -1) {
				break;
			} 

			else {

				integers[Count] = Inputs;
				Count++;
			}

		}

	}


	public boolean search(int Num) {

		boolean Find = false;

		for (int j = 0; j < Count; j++) {

			if(integers[j] == Num)
				Find = true;
		}

		return Find;
	}

	public  int FindMaximum() {

		Maximum = 0;

		for (int j = 0; j <= Count; j++) {

			if (j == 0)
				Maximum = integers[j];

			else {

				if (integers[j] > Maximum)
					Maximum = integers[j];
			}

		} 

		return Maximum;
	}

	public int FindMinimum() {

		Minimum = 0;

		for (int j = 0; j < Count; j++) {

			if (j == 0)
				Minimum = integers[j];

			else {

				if (integers[j] < Minimum)
					Minimum = integers[j];
			}

		} 

		return Minimum;
	}

	public int FindMaxPosition() {

		int Max = Integer.MIN_VALUE;

		int MaxPosition = 0;

		for (int j = 0; j < integers.length; j++) {

			if (integers[j] > Max) {
				Max = integers[j];
				MaxPosition = j;
			}
		}
		
		return MaxPosition;
	}
	
	public int FindMinPosition() {
		
		int Min = Integer.MAX_VALUE;
		
		int MinPosition = 0;
		
		for (int j = 0; j < integers.length; j++) {
		
			if (integers[j] > Min) {
				Min = integers[j];
				MinPosition = j;
			}
			
		}
		return MinPosition;
	}

}
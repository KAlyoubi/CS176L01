package Genitics;


import java.util.Random;

import java.util.Scanner;

class Characteristics {


	public String[] Characteristic;

	public Characteristics(String[] Ch) {

		Characteristic = new String[5];

		Characteristic = Ch;
	}
}

class FamilyExpressions extends Characteristics {

	public String[][] Expression;

	public String[] Combination;

	public FamilyExpressions(String[] ch, String[][] exp, String[] comb) {


		super(ch);

		Expression = new String[5][4];

		Expression = exp;

		Combination = new String[4];

		Combination = comb;

	}
}

class Mother extends FamilyExpressions {

	public String[] MGene;

	public String MFirstName;

	public Mother(String[] ch, String[][] exp, String[] comb) {

		super(ch, exp, comb);

		MGene = new String[5];

	}

	public void changeMother(String[] M) {

		MGene = M;
	}


	public void setName(String InName) {

		MFirstName = InName;
	}

	public String getName() {

		return MFirstName;
	}
}

class Father {

	public String[] FGene;

	public String FFirstName;

	public Father() {

		FGene = new String[5];

	}

	public void changeFather(String[] F) {

		FGene = F;
	}

	public void setName(String InName) {

		FFirstName = InName;
	}

	public String getName() {

		return FFirstName;
	}
}

public class Child {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Random Gene = new Random();

		String[] M = new String[5];

		String[] F = new String[5];

		String[] NoValues = new String[5];


		String[][] exp = {{"Brown", "Blue", "Green", "Grey"}, {"Brown", "Black", "Blonde", "Red"}, {"Male", "Female", "Female", "Male"}, {"6.5", "6.0", "5.5", "5.0"}, {"normal", "near", "far", "color"}};

		String[] comb = {"DD", "RR", "DR", "RD"};

		String[] ch = {"eyes", "hair", "sex", "height", "vision"};


		Mother mother = new Mother(ch, exp, comb);

		Father father = new Father();

		
		boolean Finish = false;

		String Name, ChildName, Sex, Pronoun, ChildEyeColor, ChildHairColor, ChildHeight, ChildVision, Repeat = "y";

		int GeneRandom = 0;

		while (Finish == false) {

			System.out.println("Enter the father's name: ");

			Name = in.nextLine();

			father.setName(Name);

			System.out.println("Enter the mother's name: ");

			Name = in.nextLine();

			mother.setName(Name);


			for (int i = 0; i < F.length; i++) {

				GeneRandom = Gene.nextInt(100) + 1;

				if (GeneRandom >= 50) {

					F[i] = "R";
				} 
				else {

					F[i] = "D";
				}
			}
			for (int i = 0; i < M.length; i++) {

				GeneRandom = Gene.nextInt(100) + 1;

				if (GeneRandom >= 50) {

					M[i] = "R";
				} 
				else {

					M[i] = "D";
				}
			}

			if((M[2] + F[2]).equals(comb[0]) || (F[2] + F[2]).equals(comb[3])) {

				Sex = mother.Expression[2][0];

				Pronoun = "He";
			}

			else {

				Sex = mother.Expression[2][1];

				Pronoun = "She";
			}

			System.out.println();

			System.out.print("The sex of the child is a " + Sex + ". Please enter a name for the child: ");

			ChildName = in.nextLine();

			System.out.println();

			System.out.print(ChildName + " is the child of " + mother.getName() + " and " + father.getName() + ". ");

			if ((M[0] + F[0]).equals(comb[0])){

				ChildEyeColor = mother.Expression[0][0];
			}

			else if ((M[0] + F[0]).equals(comb[1])){

				ChildEyeColor = mother.Expression[0][1];
			}

			else if ((M[0] + F[0]).equals(comb[2])){

				ChildEyeColor = mother.Expression[0][2];
			}

			else {

				ChildEyeColor = mother.Expression[0][3];
			}

			System.out.print(Pronoun + " was born with " + ChildEyeColor + " " + mother.Characteristic[0] + ", ");

			if ((M[1] + F[1]).equals(comb[0])){

				ChildHairColor = mother.Expression[1][0];
			}

			else if ((M[1] + F[1]).equals(comb[1])){

				ChildHairColor = mother.Expression[1][1];
			}

			else if ((M[1] + F[1]).equals(comb[2])){

				ChildHairColor = mother.Expression[1][2];
			}

			else {

				ChildHairColor = mother.Expression[1][3];
			}

			System.out.print(ChildHairColor + " " + mother.Characteristic[1] + ", ");

			if ((M[3] + F[3]).equals(comb[0])){

				ChildHeight = mother.Expression[3][0];
			}

			else if ((M[3] + F[3]).equals(comb[1])){

				ChildHeight = mother.Expression[3][1];
			}

			else if ((M[3] + F[3]).equals(comb[2])){

				ChildHeight = mother.Expression[3][2];
			}


			else {

				ChildHeight = mother.Expression[3][3];
			}

			System.out.print("will grow to a " + mother.Characteristic[3] + " of " + ChildHeight + ", ");

			if ((M[4] + F[4]).equals(comb[0])){

				ChildVision = mother.Expression[4][0];
			}

			else if ((M[4] + F[4]).equals(comb[1])){

				ChildVision = mother.Expression[4][1];
			}

			else if ((M[4] + F[4]).equals(comb[2])){

				ChildVision = mother.Expression[4][2];
			}

			else {

				ChildVision = mother.Expression[4][3];
			}

			System.out.print("and will have " + ChildVision + " " + mother.Characteristic[4] + ".");

			System.out.println();

			System.out.println();

			System.out.print("Would you like to do it again? ('y' or 'n'): ");

			Repeat = in.nextLine();

			if (Repeat.equalsIgnoreCase("y")) {

				Finish = false;
			}


			else if (Repeat.equalsIgnoreCase("n")) {

				Finish = true;

				System.out.println();

				System.out.println("The simulation has ended.");
			}

			else {

				System.out.print("Invalid input. Enter 'y' or 'n': ");

				Repeat = in.nextLine();

				if (Repeat.equalsIgnoreCase("y")) {

					Finish = false;
				}

				else if (Repeat.equalsIgnoreCase("n")) {

					Finish = true;

					System.out.println();

					System.out.println("The simulation has ended.");
				}
			}

		}

	}
}
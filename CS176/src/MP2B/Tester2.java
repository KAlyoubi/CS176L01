package MP2B;

public class Tester2 {

	public static void main(String[] args) {
		
		Class2 class2test = new Class2();

		class2test.load();
		class2test.search(1);
		class2test.FindMaximum();
		class2test.FindMinimum();
		class2test.FindMaxPos();
		class2test.FindMinPos();
		

		System.out.println("Was the search found?: " + class2test.search(1));
		
		System.out.println("The maximum Value is: " + class2test.FindMaximum());
		
		System.out.println("The minimum Value is: " + class2test.FindMinimum());
		
		System.out.println("Maximum Value Index Position is: " + class2test.FindMaxPos());
		
		System.out.print("Minimum Value Index Position is: " + class2test.FindMinPos());

	}

}
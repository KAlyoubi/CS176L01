package MP2A;

public class Tester1 {

	public static void main(String[] args) {

		Class1 class1tester = new Class1(100);

		class1tester.load();
		class1tester.search("abc");
		class1tester.FindMaximum();
		class1tester.FindMinimum();
		class1tester.FindLongest();
		class1tester.FindShortest();

		System.out.println("Was your search found?: " + class1tester.search("abc"));
		
		System.out.println("The highest Lexicographically is: " + class1tester.FindMaximum());
		
		System.out.println("The lowest Lexicographically is: " + class1tester.FindMinimum());
		
		System.out.println("The longest Length is: " + class1tester.FindLongest());
		
		System.out.print("The shortest Length is: " + class1tester.FindShortest());

	}

}
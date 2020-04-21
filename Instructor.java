package PeopleInheritance;

public class Instructor extends Person {


	/**
	 * An instructor is represented by a name, a birth year, and a salary.
	 * You must enter the class name, instance variable(s), and constructor below
	 */
	
	String Name;
	int Salary;
	int BirthYear;


	public String toString() {
		return "Instructor{super=" + super.toString() +
				",salary=" + Salary +
				'}';
	}
	

	public Instructor(String name, int birthYear, int salary) {
		super(name, birthYear);
		Salary = salary;

		/**
		 * Returns the string represention of the object.
		 *
		 * @return a string representation of the object
		 */

	}
}
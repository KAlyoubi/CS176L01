package PeopleInheritance;

public class Student extends Person {
	/**
	 * A student is represented by the name, birth year, and major.
	 * You must enter the class name, instance variable(s), and constructor below
	 */

	String Name;
	String Major;
	int BirthYear;


	public Student(String name, int birthYear, String major) {
		super(name, birthYear);
		Major = major;
	}


	/**
	 * Returns the string representation of the object.
	 *
	 * @return a string representation of the object
	 */
	public String toString() {
		return "Student[super=" + super.toString() + ",major=" + Major + "]";
	}

}

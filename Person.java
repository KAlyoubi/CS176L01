package PeopleInheritance;

public class Person {

    String Name;
    int BirthYear;

    public Person(String name, int birthYear) {
        Name = name;
        BirthYear = birthYear;

    }

    /**
     * Returns the string representation of the object.
     *
     * @return a string representation of the object
     */
    public String toString() {
        return "Person[name=" + Name + ",birthYear=" + BirthYear + "]";
    }


}
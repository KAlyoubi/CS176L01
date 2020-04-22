public class Country implements Measurable{


	private String Name;

	private double Area;

	public Country(String name,
			double area)  {

		this.Name = name;

		this.Area = area;
	}

	public double getMeasure(){

		return Area;
	}
}
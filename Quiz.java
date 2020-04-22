public class Quiz implements Measurable {

	private String Name;

	private double Score;

	public Quiz(String name,
			double score) {

		this.Name = name;

		this.Score = score;
	}

	public double getMeasure(){

		return Score;
	}
}
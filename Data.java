public class Data{


	public static double average(Measurable[] Objects){

		double Sum = 0;

		for (Measurable Object : Objects){

			Sum = Sum + Object.getMeasure();
		}

		if (Objects.length > 0){

			return Sum / Objects.length;
		}

		else{

			return 0;
		}
	}

	static double max(Measurable[] Objects){

		double Maximum = 0;

		if (Objects.length == 0){
			
			return 0;
		}
		
		Maximum = Objects[0].getMeasure();
		
		for (Measurable Object : Objects){
			
			if (Object.getMeasure() > Maximum){
				
				Maximum = Object.getMeasure();
			}
		}

		return Maximum;
	}
	
	public static double min(Measurable[] Objects){
		
		double Minimum = 0;
		
		if (Objects.length == 0){
			
			return 0;
		}

		Minimum = Objects[0].getMeasure();
		
		for (Measurable Object : Objects){
			
			if (Object.getMeasure() < Minimum){
				
				Minimum = Object.getMeasure();
			}
		}

		return Minimum;
	}

}
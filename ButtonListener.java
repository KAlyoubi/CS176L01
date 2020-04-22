import java.awt.event.ActionListener;


import java.awt.event.ActionEvent;

class ButtonListener implements ActionListener {


	private Measurable[] Objects;

	private String Metric;

	public ButtonListener(Measurable[] objects, 
			String metric) {

		this.Objects = objects;

		this.Metric = metric;
	}

	public void actionPerformed(ActionEvent event) {

		double Result = 0;

		if (Metric == "Maximum") {

			Result = Data.max(Objects);
		}

		if (Metric == "Minimum") {

			Result = Data.min(Objects);
		}

		if (Metric == "Average") {

			Result = Data.average(Objects);
		}

		if (Objects[0].getClass().getName().equals("BankAccount")) {

			System.out.println(Metric + " Account Balance is " + Result);
		}

		if (Objects[0].getClass().getName().equals("Country")) {

			System.out.println(Metric + " Country Area is " + Result);
		}

		if (Objects[0].getClass().getName().equals("Quiz")) {

			System.out.println(Metric + " Quiz Score is " + Result);
		}
	}
}
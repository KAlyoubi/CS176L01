import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.util.Scanner;

public class Viewer{
	

	private static final int FRAME_WIDTH = 240;
	
	private static final int FRAME_HEIGHT = 120;

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);

		
		Measurable[] Accounts = new Measurable[3];
		
		Accounts[0] = new BankAccount(0);
		
		Accounts[1] = new BankAccount(10000);
		
		Accounts[2] = new BankAccount(2000);

		

		Measurable[] Countries = new Measurable[3];
		
		Countries[0] = new Country("Uruguay", 176220);
		
		Countries[1] = new Country("Thailand", 513120);
		
		Countries[2] = new Country("Belgium", 30510);	

		
		Measurable[] Scores = new Measurable[5];
		
		Scores[0] = new Quiz("\"Joe", 60);
		
		Scores[1] = new Quiz("Sally", 90);
		
		Scores[2] = new Quiz("Jane", 100);
		
		Scores[3] = new Quiz("Billy", 85);
		
		Scores[4] = new Quiz("Sue", 75);
		
		System.out.print("Please enter a metric, 1 for maximum, 2 for minimum, 3 for average: ");
		
		int WhichMetric = in.nextInt();
		
		String MetricToUse="average";
		
		if (WhichMetric == 1) {MetricToUse = "Maximum";}
		
		if (WhichMetric == 2) {MetricToUse = "Minimum";}
		
		if (WhichMetric == 3) {MetricToUse = "Average";}

		JPanel Panel = new JPanel();
		
		JFrame Frame = new JFrame();
		
		Frame.add(Panel);

		
		JButton Button = new JButton("Get " + MetricToUse + " Balance");
		
		Panel.add(Button);
		
		ActionListener Listener = new ButtonListener(Accounts,MetricToUse);
		
		Button.addActionListener(Listener);

		
		JButton Button2 = new JButton("Get " + MetricToUse + " Area");
		
		Panel.add(Button2);
		
		ActionListener Listener2 = new ButtonListener(Countries,MetricToUse);
		

		Button2.addActionListener(Listener2);
		
		
		JButton Button3 = new JButton("Get " + MetricToUse + " Score ");
		
		Panel.add(Button3);
		
		ActionListener Listener3 = new ButtonListener(Scores,MetricToUse);
		
		Button3.addActionListener(Listener3);

		
		Frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame.setVisible(true);
	}
}
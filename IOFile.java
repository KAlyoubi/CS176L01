package IOFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Class
public class IOFile {
	
	public static void total(File inFileName) throws FileNotFoundException {
		PrintWriter total = new PrintWriter("total.txt");
		Scanner file = new Scanner(inFileName);
		double sum = 0;
		while(file.hasNext()) {
			sum = sum + Double.parseDouble(file.nextLine());
		}
		file.close();
		total.println("Sum: " + sum);
		total.close();
}
	
		//Main method
		public static void main(String[] args) throws FileNotFoundException {
			try {
			Scanner scan = new Scanner(System.in);
			System.out.println("File name: ");
			String name = scan.next();
			File numbers = new File(name);
			scan.close();
			total(numbers);
			}
			//File not found
			catch (FileNotFoundException exception) {
				System.out.println("File not found");
			}}}
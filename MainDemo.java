package Assignment8;

import java.util.HashMap;

public class MainDemo {
	public static void main(String[] args) {
		Report report = new Report();
		report.addDetails();
		try {
			//report.throwNull(); //Throws NullPointerException but still finally gets executed.
			report.getDetails("John", 56,18);
			report.getDetails("Peter",16,16); //Throws MarksIncorrectException
			report.getDetails("Paul",22,16); //Throws AgeIncorrectException
			report.getDetails("Max", 100, 20); //Throws NameNotFoundException
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}
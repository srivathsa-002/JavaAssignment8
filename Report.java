package Assignment8;

import java.util.HashMap;

public class Report {
	private HashMap<String,Integer> marksRecord;
	private HashMap<String,Integer> ageRecord;
	public Report() {
		marksRecord = new HashMap<String,Integer>();
		ageRecord = new HashMap<String,Integer>();
	}
	public void addDetails() {
		marksRecord.put("John",56);
		marksRecord.put("Peter", 96);
		marksRecord.put("Paul",22);
		ageRecord.put("John",18);
		ageRecord.put("Peter",16);
		ageRecord.put("Paul",17);
	}
	public void getDetails(String name,int marks,int age) throws AgeIncorrectException,MarksIncorrectException,NameNotFoundException {
		if(marksRecord.containsKey(name) && ageRecord.containsKey(name)) {
			if(marksRecord.get(name) == marks) {
				if(ageRecord.get(name) == age)
					System.out.println("Marks And Age of " + name + " are correct!!");
				else
					throw new AgeIncorrectException("Age of " + name + " is NOT correct");
			}
			else 
				throw new MarksIncorrectException("Marks of " + name + " are NOT correct");
				
		}
		else
			throw new NameNotFoundException(name + " Not Found");
	}
	public void throwNull() {
		throw null;
	}
}
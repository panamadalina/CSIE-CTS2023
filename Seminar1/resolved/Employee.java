package resolved.ex1;


public class Employee {
	int salaryPerHour;
	//int salary;//remove it->KISS | var care se modifica in timp si depinde de alta
	int hours;

	public void reportHours(int addHours) {// KISS
		hours+=addHours;
		//salary=salaryPerHour*hours;
		//metoda face prea multe lucruri
		//nu avem nevoie sa calc salary
	}
	
	public int findMinInsideUnsortedArray(int [] v) throws Exception {//DRY + KISS
		if(v==null || v.length==0 ) {
			throw new Exception("Vector is null");
		}
		int min=v[0];
		for(int i=0;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
//		for(int i=2;i<v.length;i=i+2) {
//			if(min>v[i]) {  //MA REPET AICI
//				min=v[i];
//			}
//		}
//				
		return min;
	}
	
	public String getExam(int numberExam) throws Exception {//KISS
	    

	    String[] exams = {
	        "OOP Exam",
	        "Java Exam",
	        "Data structure Exam",
	        "C# Exam",
	        "Statistics Exam"
	        
	    };

	    return exams[numberExam - 1];
	}
	
	
}

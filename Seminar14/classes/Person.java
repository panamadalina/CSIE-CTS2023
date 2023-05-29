package classes;

import interfaces.IPerson;

public class Person implements IPerson{

	private String name;
	private String personalNumber;
	private int age;
	private int[] costReceipts;
	
	
	public Person() {
		this.name="None";
		this.age=16;
		
	}
	
	
	public Person(String name, String personalNumber, int age, int[] costReceipts) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}
	public Person(String name, String personalNumber, int age) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		//this.grades = grades;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 public int[] getCostReceipts() {
		return costReceipts;
	}


	public void setCostReceipts(int[] costReceipts) {
		this.costReceipts = costReceipts;
	}


	@Override
	public double detAverageCost() throws Exception {
	        if( costReceipts == null || costReceipts.length < 1 ) {
	            return 1;
	        }

	        double average = 0;
	        for(int cost : costReceipts) {
	        	if(cost<=0 || cost >=2000) {
	        		throw new Exception();
	        	}
	            average += cost;
	        }

	        //double result = Math.floor((average/costReceipts.length)*100)/100;
	        //return (result > 10) ? 10 : result;
	        return average/costReceipts.length;
	    }
	
	
	
}

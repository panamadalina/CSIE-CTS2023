package mock;

import interfaces.IPerson;

public class PersonFake implements IPerson{

	private String name;
	private String personalNumber;
	private int age;
	private int[] costReceipts;
	
	public PersonFake() {
		
	}
	
	public PersonFake(String name, String personalNumber, int age, int[] costReceipts) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}

	public String getName() {
		return "Mada";
	}
	
	public String getPersonalNumber() {
		return "123456789";
	}
	
	public int getAge() {
		return 16;
	}
	
	 public int[] getCostReceipts() {
		return null;
	}

	@Override
	public double detAverageCost() throws Exception {
	       return 0;
	    }
	


}

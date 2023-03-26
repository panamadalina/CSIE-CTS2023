package facade;

public class Hotel {
private String name;
	
	public Hotel(String nume) {
		this.name = nume;
	}
	public void roomBooking(String city) {
		System.out.println("Hotel " + this.name +" din orasul " + city + "you have 1 room.");
	}
}

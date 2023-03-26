package facade;

public class Airline {
	private String numeCompanieAeriana;
		
		public Airline(String nume) {
			this.numeCompanieAeriana = nume;
		}
		
		@Override
		public String toString() {
			return "CompanieAeriana [numeCompanieAeriana=" + numeCompanieAeriana + "]";
		}
	
		public Flight flightBooking(String plecare, String destinatie) {
			Flight zbor=new Flight(plecare, destinatie, this);
			return zbor;
		}
}

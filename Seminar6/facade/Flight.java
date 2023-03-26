package facade;

public class Flight {
	private Airline companie;
	private String orasPlecare ;
	private String destinatie;
	
	public Flight(String orasPlecare, String destinatie, Airline companie) {
		super();
		this.orasPlecare = orasPlecare;
		this.destinatie = destinatie;
		this.companie = companie;
	}

	public Airline getCompanie() {
		return companie;
	}

	public void setCompanie(Airline companie) {
		this.companie = companie;
	}

	public String getOrasPlecare() {
		return orasPlecare;
	}

	public void setOrasPlecare(String orasPlecare) {
		this.orasPlecare = orasPlecare;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	@Override
	public String toString() {
		return "Zbor [companie=" + companie + ", orasPlecare=" + orasPlecare + ", destinatie=" + destinatie + "]";
	}

}

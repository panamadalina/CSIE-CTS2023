package resolved.classes;


public class Market implements Comparable<Market>{
	private String name;
	private int noEmployees;
	private ETypeMarket typeMarket;
	private int areaMP;
	
	
	public Market(String name, int noEmployees, ETypeMarket typeMarket, int areaMP) {
		super();
		this.name = name;
		this.noEmployees = noEmployees;
		this.typeMarket = typeMarket;
		this.areaMP = areaMP;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoEmployees() {
		return noEmployees;
	}
	public void setNoEmployees(int noEmployees) {
		this.noEmployees = noEmployees;
	}
	public ETypeMarket getTypeMarket() {
		return typeMarket;
	}
	public void setTypeMarket(ETypeMarket typeMarket) {
		this.typeMarket = typeMarket;
	}
	public int getAreaMP() {
		return areaMP;
	}
	public void setAreaMP(int areaMP) {
		this.areaMP = areaMP;
	}
	@Override
	public int compareTo(Market obj) {
		// TODO Auto-generated method stub
		return this.areaMP-obj.areaMP;
	}



}

package resolved.classes;

import java.util.ArrayList;

import resolved.exceptions.ExceptionCalculateInsurance;
import resolved.exceptions.ExceptionMarket;
import resolved.interfaces.IAuthorization;

public class Supermarket {
	private String name;
	private int area;
	private ArrayList<Market> shops;
		
	public Supermarket(String name, int area, ArrayList<Market> shops) {
		super();
		this.name = name;
		this.area = area;
		this.shops = shops;
	}

	public String getBiggestMarketByArea(ETypeMarket typeMarket) {//TEST IT
		Market result = shops.get(0);
		for(Market m: shops) {
			if(m.getTypeMarket() == typeMarket && m.getAreaMP()>result.getAreaMP())
				result = m;	
		}
		return result.getName();
	}
	
	public String getBiggestMarketByArea2(ETypeMarket typeMarket) throws ExceptionMarket {//TEST IT
		if(this.shops==null||this.shops.size()==0) {
			throw new ExceptionMarket();
		}
			
		Market result = shops.get(0);
		for(Market m: shops) {
			if(m.getTypeMarket() == typeMarket && m.getAreaMP()>result.getAreaMP())
				result = m;	
		}
		return result.getName();
	}
	
	public float calculatePriceInsurance(IAuthorization authorization) throws ExceptionCalculateInsurance {
		if(authorization.hasInsurance(this)){
			float tax = authorization.priceInsuranceMP();
			int area = 0;
			for(Market m: shops) {
				area += m.getAreaMP();
			}
			return tax * area;
		}
		else
			throw new ExceptionCalculateInsurance();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public ArrayList<Market> getShops() {
		return shops;
	}

	public void setShops(ArrayList<Market> shops) {
		this.shops = shops;
	}
	
	
	
}

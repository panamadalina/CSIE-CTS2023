package abstractFactory;

public class Shop {
	IFactory category;
	 
	public Shop(IFactory _category) {//price
		this.category=_category;
		
	}
	public void createFamilyRelatedData() {
		ICostume costume=this.category.createCostume();
		IWeapon weapon=this.category.createWeapon();
		costume.protection();
		weapon.power();
	}
	

}

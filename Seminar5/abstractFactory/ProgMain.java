package abstractFactory;

public class ProgMain {

	public static void main(String[] args) {
		IFactory fact=new HighBugdetFactory();
		Shop shop=new Shop(fact);
		shop.createFamilyRelatedData();//return IWeapon & ICostume
	}
}

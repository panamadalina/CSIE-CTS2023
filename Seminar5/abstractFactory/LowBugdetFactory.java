package abstractFactory;

public class LowBugdetFactory implements IFactory{

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new CheapWeapon();
	}

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new CheapCostme();
	}

}

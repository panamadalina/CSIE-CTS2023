package abstractFactory;

public class HighBugdetFactory implements IFactory{

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new MagicWeapon();
	}

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new MagicCostume();
	}

}

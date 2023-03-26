package adapter2;

public class EvaluationB implements IEvaluationB {

	@Override
	public double evaluateClientB(Client client) {
		// TODO Auto-generated method stub
		System.out.println("Call method B");
		double total=0;
		for(int i=0;i<client.getNoEvents();i++) {
			total+=client.getCostsEvents()[i];
		}
		if(total>1000) {
			return 0.1;
		
		}
		if(total>500) {
			return 0.05;
		}
		
		return 0;
	}

}

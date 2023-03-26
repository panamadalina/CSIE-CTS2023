package adapter2;

public class EvaluationA implements IEvaluationA {

	@Override
	public double evaluateClientA(int totalCost) {
		System.out.println("Call method A");
		if(totalCost>1000) {
			return 0.1;
		
		}
		if(totalCost>500) {
			return 0.05;
		}
		return 0;
	}

}

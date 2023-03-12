package solid.d2.resolved;

public class SubtractOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numB) {
        return numbA - numB;
    }
}
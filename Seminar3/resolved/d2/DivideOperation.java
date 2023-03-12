package solid.d2.resolved;

public class DivideOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numB) {
        return numbA / numB;
    }
}
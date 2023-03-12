package solid.d2.resolved;

public class Calculator {
/*
 * Now there is loose coupling between the Calculator module and the Operations modules. 
 * Now you can change one side of the dependency without affecting the other side. 
 * You can also add more operations, 
 * as long as they implement the Operation abstraction, 
 * without affecting the Calculator module.
 */
    /**
     * Performs a two numbers operation.
     * @param numA              First number.
     * @param numB              Second number.
     * @param operation         Type of operation.
     * @return                  Operation's result.
     */
    public double calculate(double numA, double numB, CalculatorOperation operation){
        return operation.calculate(numB, numB);
    }
}
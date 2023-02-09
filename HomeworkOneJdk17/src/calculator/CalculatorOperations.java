package calculator;

public class CalculatorOperations {

    public int sum(int x, int y) {
        int sumOfBothParameters = x + y;
        return sumOfBothParameters;
    }
    public int minus(int x, int y){
        int resultOfMinus = x - y;
        return resultOfMinus;
    }
    public int multiplication(int x, int y){
        int resultOfMultiplication = x * y;
        return resultOfMultiplication;
    }
    public double division(double x, double y){
        double resultOfDivision = x / y;
        return resultOfDivision;
    }
}

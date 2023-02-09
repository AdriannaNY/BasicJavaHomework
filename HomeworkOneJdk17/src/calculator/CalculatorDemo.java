package calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperations();
        int a = 10;
        int b = 4;

        int resultOfSum = calculatorOperations.sum(a, b);
        System.out.println(resultOfSum);

        int resultOfSubstruction = calculatorOperations.minus(a, b);
        System.out.println(resultOfSubstruction);

        int resultOfMultiplication = calculatorOperations.multiplication(a, b);
        System.out.println(resultOfMultiplication);

        double resultOfDivision = calculatorOperations.division(a,b);
        System.out.println(resultOfDivision);
    }
}

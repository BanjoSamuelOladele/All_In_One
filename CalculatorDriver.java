public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       int result = calculator.calculate(5,6 , '-');
        System.out.println("the result is: " + result);
    }
}

public class Calculator {
    public int calculate(int firstNumber, int secondNumber, char operator){
        return switch (operator) {
            case '+' -> performAddition(firstNumber, secondNumber);
            case '-' -> performSubtraction(firstNumber, secondNumber);
            case '*' -> performMultiplication(firstNumber, secondNumber);
            case '/' -> performDivision(firstNumber, secondNumber);
            default -> 0;
        };
    }
    private int performAddition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    private int performSubtraction(int firstNumber, int secondNumber){
        if (secondNumber > firstNumber) {
            return secondNumber - firstNumber;
        }
       else return firstNumber - secondNumber;
    }
    private int performMultiplication(int firstNumber, int secondNumber){return firstNumber * secondNumber;}
    private int performDivision(int firstNumber, int secondNumber){
        if (secondNumber > firstNumber) {return secondNumber / firstNumber;}
        else return firstNumber / secondNumber;
    }
}

package takeHome;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int absolute(int firstNumber, int secondNumber) {
      if(firstNumber < secondNumber) return secondNumber - firstNumber;
      return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int absoluteMulti(int firstNumber, int secondNumber) {
       if(0 > firstNumber) {
           return -1 * firstNumber * secondNumber;
       }
       if(0 > secondNumber){
           return -1 * firstNumber * secondNumber;
       }
       return 0;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int absDivide(int firstNumber, int secondNumber) {
        if(secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }

    public int module(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}

package Assignment;

public class UsingTheDifferentTypesOfLoopsToGetTheTotalInAnArray {
    public int sumOfAnArrayUsingForLoop(int[] arrayOfNumbers) {
        int sum = 0;
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            sum += arrayOfNumbers[index];
        }
        return sum;
    }

    public int sumOfAnArrayUsingWhileLoop(int[] arrayOfNumbers) {
        int sum =0, index =0;
        while (index < arrayOfNumbers.length){
            sum += arrayOfNumbers[index];
            index++;
        }
        return sum;
    }

    public int sumOfAnArrayUsingDoWhileLoop(int[] arrayOfNumbers) {
        int sum =0, index =0;
        do {
            sum += arrayOfNumbers[index];
            index++;
        } while (index < arrayOfNumbers.length);
        return 0;
    }
}

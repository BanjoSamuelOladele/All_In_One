package Assignment;

public class RunningTotalOfAnArray {
    public int sumOfAnArray(int[] arrayOfNumbers) {
        int sumOfArray = 0;
        for(int number : arrayOfNumbers){
            sumOfArray += number;
        }
        return sumOfArray;
    }
}

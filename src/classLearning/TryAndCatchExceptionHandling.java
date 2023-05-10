package classLearning;

public class TryAndCatchExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arrayOfNumbers = {2, 5, 6, 7};
            System.out.println((arrayOfNumbers[10]));
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}

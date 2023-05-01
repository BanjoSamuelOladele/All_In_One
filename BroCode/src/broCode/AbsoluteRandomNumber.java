package broCode;
import java.util.Random;
public class AbsoluteRandomNumber {
    static Random randomNumber = new Random();

    public static void main(String[] args) {
        int absoluteGenerator = 0;

        int generatePossobleAccountNumber = randomNumber.nextInt(0,10);
        for (int i = 1; i < 9; i++) {
            absoluteGenerator +=Math.abs(generatePossobleAccountNumber);
            System.out.print(absoluteGenerator);
        }
    }
}
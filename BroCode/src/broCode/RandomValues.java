package broCode;
import java.util.Random;
public class RandomValues {
    public static void main(String[] args) {
        Random anyNUmber = new Random();
        int randomNumberGenerator = anyNUmber.nextInt();
        System.out.println(randomNumberGenerator);
        System.out.println();
        int specifiedNumberOfGenerator =  + Math.abs(anyNUmber.nextInt(1, 7));//0 -9
        System.out.println(specifiedNumberOfGenerator);
        System.out.println();
//        double randomNumberForFloats = anyNUmber.nextDouble();
//        System.out.println(randomNumberForFloats);
        System.out.println();
        boolean checkerelseIf = anyNUmber.nextBoolean();
        System.out.println(checkerelseIf);
    }
}

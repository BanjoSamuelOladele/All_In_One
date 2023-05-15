package Assignment;

public class ConvertASetOfNumbersToArray {
    public int[] numberArray(String number) {
        int[] arrayOfNumbers = new int[number.length()];
        int parseNumber = Integer.parseInt(number);
        for (int index = 0; index < number.length(); index++) {
            int remainder = parseNumber%10;
            arrayOfNumbers[number.length()-index-1] = remainder;
            parseNumber/=10;
        }
        return arrayOfNumbers;
    }
}

package PlayGround;

public class Visualize {
    public static void main(String[] args) {
        int[] arrayLength = {3, 4, 5, 6, 7};

        int[] arrayOfNumbers = new int[5];

//        for (int index = 0; index < arrayLength.length; index++) {
//            System.out.println(arrayLength[index] + " ");
//        }
//        for (int index = 0; index < arrayLength.length; index++) {
//            System.out.printf(getArray();
//        }
//        for (int index = 0; index < arrayOfNumbers.length; index++) {
//            System.out.println(arrayOfNumbers[index] += index);
//        }
//        System.out.println(Arrays.toString(getArray(arrayOfNumbers)));
//        System.out.println(Arrays.toString(getArray(arrayLength)));
        forSetting(arrayOfNumbers);
        System.out.println(arrayToString(arrayOfNumbers));
        System.out.println(getArray(arrayOfNumbers));
    }
    public static int[] getArray(int[] array){
        for (int index = 0; index < array.length; index++) {
            array[index] += index;
        }
        return array;
    }
    public static String arrayToString(int [] array){
        String arrayOfNumber = "[";
        for (int index = 0; index < array.length; index++) {
            if (index < array.length -1) arrayOfNumber += array[index] + ",";
            if (index == array.length - 1) arrayOfNumber += array[index];
        }
        arrayOfNumber += "]";

        return arrayOfNumber;
    }
    private static void forSetting(int [] arrayOfNumbers){
        for (int index = 0; index < arrayOfNumbers.length; index++) arrayOfNumbers[index] += index;
    }
}

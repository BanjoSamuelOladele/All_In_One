package broCode;

import java.util.Arrays;

public class PlayGround {
    /*

    == equal to
    != not equal
    < less than
    > greater than
    >= greater than or equal to
    <= less than or equal to

     */
    /*
    && and operator, both side must be true
    || at least one side must be true
     */
    /*
    a loop is a piece of code that run a block of code or instruction over and over again\
    so far the condition is true until the condition becomes false
     */
    /*
    array are collection of data with same data type

     */
    /*
    String is a collection of characters.
     */

    public static void main(String[] args) {
//        int x = 10;
//        if (x == 10) System.out.println(x + " is 10");
//        if (x <= 10) System.out.println(x + "is less or equal to 10");
//        if (x > 20) System.out.println(x + " is greater then 20");
//        else System.out.println(x + " is less");
//        int x = 70;
//        int y = 60;
//        int z =40;
//        if (x > 60 && y > 50 || z > 60) System.out.println("good");
//        else System.out.println("dy play");
//        int score = 95;
//        score /= 10;
//        switch (score){
//            case 9:
//            case 10:
//                System.out.println("A");
//            break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("grade not defined");
//        }
//        int a = 0;
//        while (a < 10) {
//            System.out.print(a);
//            System.out.print(" ");
//        a++;
//        }
//        System.out.println(a);
//
//        while (a > 0){
//            System.out.print(a);
//            System.out.print(" ");
//            a--;
//        }

//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b <= -1);
        int[] arrayIntegers = {1, 2, 3, 4, 5};
//        int arrayInt[] = {2,4,6,8};
//        int[] arrayTray = new int[3];
//        int[] getMyArray = new int[] {2,5,7,8,9};
//        // array deals with indexes
//        System.out.println(arrayIntegers[2]);
//        System.out.println(Arrays.stream(arrayIntegers).sorted());
//
//        int index = 0;
//        while (index < arrayIntegers.length){
//            System.out.println(arrayIntegers[index]);
//            index++;
//        }
//        for (int index = 0; index < arrayIntegers.length; index++) {
//            System.out.println(arrayIntegers[index]);
//        }
//        for (int element : arrayIntegers){
//            System.out.println(element);
//        }
        String myString = "Hello World";
        int lengthOfMyString = myString.length();
        System.out.println(myString);
        System.out.println(lengthOfMyString);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        String myStrinAgain = "Hello World";
        System.out.println(myStrinAgain.replace("e", "a"));
        System.out.println(myString.indexOf("o"));

    }
}

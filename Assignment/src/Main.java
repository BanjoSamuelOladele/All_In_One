import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int numb = 1;
        int num = 4;

        while(number < 10){
            number = number + 2;
                System.out.println(number);
        }
        while(numb < 9){
            numb = numb + 2;
            System.out.println(numb);
        }
        if(num == 6) System.out.println("number is greater than 5");
        else {System.out.println("number is less than six");}

        System.out.print("Enter a number: ");
        int collect = input.nextInt();

        if(collect > 5) System.out.println("Number input is greater than 5");
        else if(collect == 5 ) System.out.println("number is 5");
        else System.out.println("number is less than 5");

    }
}
package inClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sales, totalSales = 0;
        int counter = 0;

        while(counter < 5){
            System.out.print("Enter the sales for product: " + counter + " ");
            sales = input.nextInt();

            totalSales = totalSales + sales;
            System.out.println("Sales id: " + sales);
            System.out.println("Countter is on: " + counter);
            System.out.println("Total Sales is: " + totalSales);
            counter = counter + 1;
        }
        System.out.println("our average sales is: " + totalSales/counter);
    }
}

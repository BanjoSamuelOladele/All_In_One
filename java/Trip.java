import java.util.Scanner;
public class Trip {

	public static void main(String[] args){
		double distance, miles, price, cost;
		Scanner receive = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		distance = receive.nextFloat();
		System.out.print("Enter the miles per gallon: ");
		miles = receive.nextFloat();
		System.out.print("Enter the total Price: ");
		price = receive.nextFloat();
		
		cost = (price * distance)/miles;

		System.out.println("The cost of driving is: " + cost);

	}




}
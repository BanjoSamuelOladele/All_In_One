import java.util.Scanner;
public class Energy{

	public static void main (String[] args){
		double weight; 
		double fiinal;
		double initial; 
		double amount;

		Scanner receive = new Scanner(System.in);
		System.out.print("Enter amount of Water in weight: ");
		weight = receive.nextFloat();
		System.out.print("Enter the Initial Temperature: ");
		initial = receive.nextFloat();
		System.out.print("Enter the Final Temperature: ");
		fiinal = receive.nextFloat();

		amount = weight * (fiinal - initial) * 4148;

		System.out.printf("%s", "The energy needed is: " + amount);

		
	}





}
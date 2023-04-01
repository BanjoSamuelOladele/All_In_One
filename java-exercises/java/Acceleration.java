import java.util.Scanner;
public class Acceleration{
	public static void main(String[] args){
		double acceleration;
		double time;
		double velocity1;
		double velocity;
		Scanner collect = new Scanner(System.in);
		System.out.print("Enter Initial Velocity;: ");
		velocity = collect.nextFloat();
		System.out.print("Enter Final Velocity: ");
		velocity1 = collect.nextFloat();
		System.out.print("Enter the time taken: ");
		time = collect.nextFloat();
		acceleration = (velocity1 - velocity)/time;
		System.out.println("The acceleration is: "+ acceleration);
	}



}
import java.util.Scanner;
public class HealthApplication{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double weight, height;
	System.out.print("Enter weight in pounds: ");
	weight = input.nextFloat();
	System.out.print("Enter height in inches: ");
	height = input.nextFloat();
	
	double poun = weight * 0.45359237;
	double inc = height * 0.0254;
	double then = height * height;
	double bmi = poun/then;


	System.out.println("BMI is: " + bmi);

	}
}
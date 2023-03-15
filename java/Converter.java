import java.util.Scanner;
public class Converter {
	public static void main(String[] args){

	double ask, result;
	Scanner receive = new Scanner(System.in);
	System.out.print("Enter number in pounds: ");
	ask = receive.nextFloat();
	
	result = ask * 0.454;
	System.out.println(ask + " pounds is: " + result + "kg");

	}







}
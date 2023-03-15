import java.util.Scanner;

class FinancialApp{
	
	public static void main(String[] args){
	
		double interest, balance, annualRate;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of the balance: ");
		balance = input.nextDouble();
		
		input.nextLine();
		
		System.out.print("Enter the value of the annual interest rate: ");
		annualRate = input.nextDouble();
		
		double base = annualRate/1200;
		
		interest = balance * base;
		
		System.out.printf("The interest is: %f%n", interest);
	
	}





}

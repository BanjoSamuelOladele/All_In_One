import java.util.Scanner;

class FutureWave{

	public static void main(String[] args){
	double investmentA;
	double monthlyRate;
	double annualInt;
	double futureI;
	double future;
	double sum;
	double power;
	int yearsIn;
	int yearN;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the investment amount: ");
	investmentA = input.nextDouble();
	
	input.nextLine();
	
	System.out.print("Enter the annual interest in percentage: ");
	annualInt = input.nextDouble();
	
	input.nextLine();
	
	System.out.print("Enter the number of years: ");
	yearsIn = input.nextInt();
	
	monthlyRate = (annualInt / (12 * 100));
	yearN = yearsIn * 12;
	sum = 1 + monthlyRate;
	power = Math.pow(sum, yearN);
	
	futureI = investmentA * power;
	
	System.out.printf("The Accumulated value is: %f", futureI);
	
	
	}


}

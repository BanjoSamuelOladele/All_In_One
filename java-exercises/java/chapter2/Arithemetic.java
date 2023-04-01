import java.util.Scanner;

class Arithemetic {

	public static void main(String[] args){
	int firstNumber, secondNumber, sum, difference, firstNumberS, secondNumberS;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
	firstNumber = input.nextInt();
	
	input.nextLine();
	
	System.out.print("Enter the second number: ");
	secondNumber = input.nextInt();
	
	firstNumberS = firstNumber * firstNumber;

	secondNumberS = secondNumber * secondNumber;
	
	sum = firstNumberS + secondNumberS;
	difference = firstNumberS - secondNumberS;
	
	System.out.printf("the square of the first number %d is: %d%n", firstNumber, firstNumberS);
	System.out.printf("the square of the first number %d is: %d%n", secondNumber, secondNumberS);
	System.out.printf("The sum of their square is: %d%n", sum);
	System.out.printf("the difference of their square is: %d%n", difference);
	
	
	}



}

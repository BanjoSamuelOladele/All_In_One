import java.util.Scanner;


class SumDigits{

	public static void main(String[] args){
	
	int first;
	int first1;
	int second;
	int second2;
	int third;
	int third3;
	int fourth;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	first = input.nextInt(); // 999
	
	first1 = first % 10; //9
	
	second = first / 10; //99
	
	second2 = second % 10; //9
	
	third = second / 10; //9
	
	System.out.printf("the sum of the digits is %d, %d, %d = %d+%d+%d", first1, second2,  third, first1 + second2 + third);
	
	
	}


}

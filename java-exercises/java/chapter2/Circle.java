import java.util.Scanner;

class Circle {

	public static void main(String[] args){
	
	int r;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the value of the Radius: ");
	r = input.nextInt();
	
	System.out.println("diameter = " + (2 * r));
	System.out.println("circumference = " + (2 * 3.14159 * r));
	System.out.println("area = " + (3.14159 * r * r));
	
	}

}

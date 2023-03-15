import java.util.Scanner;

class Runway {

	public static void main(String[] args){
		double length;
		double speed;
		double acceleration;
		double leng;
		double accel;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Speed and Acceleration ");
		speed = input.nextDouble(); acceleration = input.nextDouble();
		
		
	accel = 2 * acceleration;
	leng = Math.pow(speed, 2);
	
	length = leng / accel;
	
	System.out.printf("the minimum runway length for this airplane is: %f%n",length);
	
	}

}


import java.util.Scanner;

class ClockTest{

	public static void main(String[] args){
		
		Clock clock1 = new Clock(0, 23, 23);
		
		System.out.printf("Time is: %d:%d:%d%n", clock1.getHour(), clock1.getMinutes(), clock1.getSecond());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in hour, minute and seconds: ");
		int time1 = input.nextInt(), time2 = input.nextInt(), time3 = input.nextInt();
		
		clock1.setHour(time1);
		clock1.setMinutes(time2);
		clock1.setSecond(time3);
		
		System.out.printf("next Time is: %d:%d:%d%n%n", clock1.getHour(), clock1.getMinutes(), clock1.getSecond());
		
	}

}

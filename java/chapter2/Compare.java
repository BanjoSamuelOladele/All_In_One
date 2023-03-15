import java.util.Scanner;

class Compare{

	public static void main(String[] args){
	
	int collect;
	int square;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an Integer: ");
	collect = input.nextInt();
	
	square = collect * collect;
	
	
	
	if (square != 100) {
	System.out.printf("%d != 100%n", square);
	}
	
	if (square == 100){
	System.out.printf("%d == 100%n", square);
		}
	if (square < 100) {
	System.out.printf("%d < 100%n", square);
		}
		
	if (square > 100) {
	System.out.printf("%d > 100%n", square);
		}
	

}

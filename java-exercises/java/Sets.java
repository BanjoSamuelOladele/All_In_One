import java.util.Scanner;


public class Sets{

	public static void main(String[] args){
	 	Scanner set = new Scanner(System.in);
	 	int result;
	 	int odd;
	 	int even;
	 	System.out.println("Enter an integer: ");
	 	result = set.nextInt();
	 	even = 0||2||4||6||8||10;
	 	odd = 1||3||5||7||9;
	 	
	 	if (result == even){
	 		System.out.println(result + " is an even number");
	 	}else {
	 		System.out.println(result + " is an odd number");
	 	}
		
	}




}

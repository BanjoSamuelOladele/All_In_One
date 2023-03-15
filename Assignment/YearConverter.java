import java.util.Scanner;

public class YearConverter{

	public static void main(String[] args){
		//for day 60*24 = 1440
		// MOY 60*24*365 = 525,600

		int moy;
		int update;
		moy = 525600;

	Scanner recieve = new Scanner(System.in);
	System.out.print("Enter the number of Minutes: ");
	update = recieve.nextInt();
	
	int convert = (update/moy);//number of years
	int conv = update % moy;//the remainder from the number of years
	int convv = conv/1440;//number of days
	int mint = convv%1440;//the remainder from the number of days.
	int mintt = mint/60;//number of minutes
	int secs = mintt%60;
	int sec = secs/60;
	System.out.println("The " + update + " minutes is converted to " + convert + " years, " + convv + " days, " + mintt + " minutes and " + sec + " seconds");	
	}







}
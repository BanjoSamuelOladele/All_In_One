import java.util.Scanner;

class Millage{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      int milesDriven = 0;
      int gallonsUsed =0;
      int numberOfTrip = 0;
      int milesPerGallon =0;
      int milesGallonForAllTrip =0;
      int averageForAllTrip =0;
      
      
        System.out.print("Enter 1 to start: ");
        milesDriven = input.nextInt();
        
      while(milesDriven != 0){
        System.out.print("Enter the miles covered: ");
        milesDriven = input.nextInt();
      
        input.nextLine();
      
        System.out.print("Enter the number of gallon(s) used: ");
        gallonsUsed = input.nextInt();
        
        if(milesDriven > 0 && gallonsUsed > 0) numberOfTrip++;
        
        milesPerGallon = milesDriven * gallonsUsed;
        
        milesGallonForAllTrip += milesPerGallon;
        System.out.printf("%s%d%s%d%n","For trip: ",numberOfTrip," gallons used is: ",milesPerGallon);
      }
      
      averageForAllTrip = (milesGallonForAllTrip / numberOfTrip);
      System.out.println("The total number of trip is: " + numberOfTrip);
      System.out.println("The gas used for all trip is: " + milesGallonForAllTrip);
      System.out.println("The average gas used for all trip is: " + averageForAllTrip);
      
      
  }
}

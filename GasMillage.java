package C4;
import java.util.Scanner;
public class GasMillage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int milesDriven;
        int gallonUsed;
        int totalPerTrip;
        int total4AllTrips = 0;
        double averageOfAllTrips = 0;
        int numberOfTrips = 0;

        do {
                System.out.print("Enter the number of Miles Taken: ");
                milesDriven = input.nextInt();
                if (milesDriven > 0) numberOfTrips++;
                System.out.print("Enter the amount of gallon(s) used: ");
                gallonUsed = input.nextInt();

                totalPerTrip = milesDriven * gallonUsed;
                total4AllTrips += totalPerTrip;
                averageOfAllTrips = (double) total4AllTrips / numberOfTrips;

                System.out.println("Trip: " + numberOfTrips + ", " + totalPerTrip + " galons/miles used");

        } while (milesDriven != 0 );
        System.out.println("Number of journey: " + numberOfTrips);
        System.out.println("Total galons/miles for all trips: " + total4AllTrips);
        System.out.println("Average of all trips: " + averageOfAllTrips);
    }
}

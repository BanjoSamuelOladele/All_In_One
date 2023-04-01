import java.util.Scanner;


class Petrol{

	public static void main(String[] args){
	
	/*PetrolPurchase input = new PetrolPurchase();
	System.out.printf("before inputs: %s%s%d%f%f", input.getLocation(), input.getPetrolType(), input.getQuantity(), input.getPrice(), input.getDiscount());
	
	Scanner update = new Scanner(System.in);
	
	System.out.print("Enter station location: ");
	String locate = update.nextLine();
	System.out.print("Enter Fuel type: ");
	String epo = update.nextLine();
	System.out.print("Enter litres: ");
	int litre = update.nextInt();
	update.nextLine();
	System.out.print("Enter fuel price: ");
	double fuelP = update.nextDouble();
	update.nextLine();
	System.out.print("Enter discounted amount: ");
	double disC = update.nextDouble();
	
	input.setLocation(locate);
	input.setPetrolType(epo);
	input.setQuantity(litre);
	input.setPrice(fuelP);
	input.setDiscount(disC);
	
	
	System.out.printf("Station location: %s%n PetrolType: %s%n Litres: %d%n FuelPrice: %.2f%n DiscountedAmount: %.2f%n PayableAmount: %.2f%n%n", input.getLocation(), input.getPetrolType(), input.getQuantity(), input.getPrice(), input.getDiscount(), input.getPurchaseAmount());
	*/
	
	PetrolPurchase collect = new PetrolPurchase("lagos", "pms", 4, 150.89,20.88);
	
	System.out.printf("station location: %s%n PetrolType: %s%n Price: %.2f%n", collect.getLocation(), collect.getPetrolType(), collect.getPrice());
	//System.out.println("Station loaction: " + collect.getLocation());
	System.out.printf("the amount payable is: %.2f%n%n", collect.getPurchaseAmount());
	
	}


} 

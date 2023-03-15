import java.util.Scanner;



class CarApplication{

	public static void main(String[] args){
		
		//Car car1 = new Car("Toyota", "2020", 85);
		//Car car2 = new Car("lexus", "2019", 200.56);
		
		
		//System.out.printf("Model name: %s%n Model Year: %s%n Price: %.2f%n%n", car1.getModel(), car1.getYear(), car1.getPrice());
		//System.out.printf("Model name: %s%n Model Year: %s%n Price: %.2f%n%n", car2.getModel(), car2.getYear(), car2.getPrice());
		Scanner collect = new Scanner(System.in);
		
		Car car1 = new Car("Toyota", "1999", 708);
		Car car2 = new Car("Lexus", "2001", -78);
		
		
		
		/*
		
		
		car1.setPrice();
		
		
		car2.setPrice();
		
		double pers = modep1 * (5/100);
		double perc = modep2 * (7/100);
		
		System.out.println("Adding the percent value to the price");
		*/
		
		System.out.printf("Model: %s%n Year: %s%n Price: %.2f%n%n", car1.getModel(), car1.getYear(), car1.getPrice());
		System.out.printf("Model: %s%n Year: %s%n Price: %.2f%n%n", car2.getModel(), car2.getYear(), car2.getPrice());
		
		
		System.out.print("Adding the percent value to the price1: ");
		double padd = collect.nextDouble();
		collect.nextLine();
		System.out.print("Adding the percent value to the price2: ");
		double padde = collect.nextDouble();
		collect.nextLine();
		
		car1.setPercentage(padd);
		car2.setPercentage(padde);
		
		
		System.out.printf("Model: %s%n Year: %s%n Price: %.2f%n Percentage: %.2f%n%n", car1.getModel(), car1.getYear(), car1.getPrice(), car1.getPercentage());
		System.out.printf("Model: %s%n Year: %s%n Price: %.2f%n Percentage: %.2f%n%n", car2.getModel(), car2.getYear(), car2.getPrice(), car2.getPercentage());
		
		
		
	
	}


}

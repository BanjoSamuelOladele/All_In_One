class Car{

	private String model;
	private String year;
	private double price;
	
	private double casee;
	
	public Car(String model, String year, double price){
		this.model = model;
		
		this.year = year;
		if (price > 0){
		this.price = price;
		}
	}
	
	public void setModel(String mode){
		model = mode;
	}
	public String getModel(){
		return model;
	}
	
	public void setYear(String yYear){
		year = yYear;
	}
	public String getYear(){
		return year;
	}
	
	public void setPrice(double pPrice){
		
			price = pPrice;
	
	
	}
	public double getPrice(){
		return price;
	}
	
	public void setPercentage(double number){
		casee = number;
	}
	public double getPercentage(){
		double rest = casee/100;
		
		
		return (price + rest);	
	}


}

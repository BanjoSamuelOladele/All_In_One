class PetrolPurchase{
	private String location;
	private String petrolType;
	private int quantity;
	private double price;
	private double discount;
	
	public PetrolPurchase(String location, String petrolType, int quantity, double price, double discount){
		this.location = location;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
			
	}// end of constructor.
	
	public void setLocation(String locator){
		location = locator;
	}
	public String getLocation(){
		return location;
	}
	
	public void setPetrolType(String pettrol){
		petrolType = pettrol;
	}
	public String getPetrolType(){
		return petrolType;
	}
	
	public void setQuantity(int quantityy){
		quantity = quantityy;
	}
	public int getQuantity(){
		return quantity;
	}
	
	public void setPrice(double pPrice){
		price = pPrice;
	}
	public double getPrice(){
		return price;
	}
	
	public void setDiscount(double disCount){
		discount = disCount;
	}
	public double getDiscount(){
		return discount;
	}
	
	public double getPurchaseAmount(){
		
		return ((quantity * price) - discount);
		
	}


}

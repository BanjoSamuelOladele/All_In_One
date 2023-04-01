

class Account{

	/*private String name;
	
	public void setName(String nName){
	
		name = nName;
	}
	
	public String getName(){
	
		return name;
	}

*/

	//with a contructor now and a single parameter
	/*
	private String name;
	
	public Account(String nName){
		name = nName;
	}
	
	public void setName(String nnName){
		name = nnName;
	
	}
	
	public String getName(){
		return name;
	}
	*/
	
	//with a constructor and two parameters
	
	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String nName){
		name = nName;
	}
	
	public String getName(){
		return name;
	}


}

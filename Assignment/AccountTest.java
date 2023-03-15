import java.util.Scanner;

class AccountTest{

	public static void main(String[] args){
	
		/*Scanner collect = new Scanner(System.in);
		Account aAccount = new Account();
		
		System.out.printf("Before input: %s%n%n%n", aAccount.getName());
		
		System.out.print("Enter account name: ");
		String realName = collect.nextLine();
		aAccount.setName(realName);
		System.out.println();
		
		
		System.out.printf("Account name is: %S%n", aAccount.getName());
		*/
		/*
		Account firstAccount = new Account("Banjo Samuel");
		Account secondAccount = new Account("Oladele Samuel");
		
		System.out.printf("Account name is: %s%n%n", firstAccount.getName());
		System.out.printf("Account name is: %s%n%n", secondAccount.getName());
		*/
		
		Account firstAccount = new Account("Banjo Samuel O.", 20.98);
		Account secondAccount = new Account("Oladele SAmuel Idowu", -7.88);
		
		System.out.printf("initial balance for %s is: %.2f%n%n", firstAccount.getName(), firstAccount.getBalance());
		System.out.printf("initial balance for %s is: %.2f%n%n", secondAccount.getName(), secondAccount.getBalance());
		
		Scanner collect = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for first account: ");
		double realDeposit = collect.nextDouble();
		collect.nextLine();
		System.out.print("Enter deposit amoubt for second account: ");
		double realDeposit1 = collect.nextDouble();
		
		System.out.printf("Adding %.2f deposit to first account%n%n", realDeposit);
		System.out.printf("Adding %.2f deposit for second account%n%n", realDeposit1);
		
		firstAccount.deposit(realDeposit);
		secondAccount.deposit(realDeposit1);
		
		System.out.printf("Account balance for %s is: %.2f%n%n", firstAccount.getName(), firstAccount.getBalance());
		System.out.printf("Account balance for %s is: %.2f%n", secondAccount.getName(), secondAccount.getBalance());
	
	}




}

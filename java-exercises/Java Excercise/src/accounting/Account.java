package accounting;

public class Account {
    private int balance;
    private int get;
    public void deposit(int amount) {
        if(amount > 0) balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withDraw(int amount) {

        if(balance >= amount) balance = balance - amount;
        if(amount < 0) balance = balance + (0 * amount);
    }
}

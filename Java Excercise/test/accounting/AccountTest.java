package accounting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account myAccount = new Account();

    @Test public void depositMoneyTest(){
        myAccount.deposit(2000);
        int balance = myAccount.getBalance();
        assertEquals(2_000, balance);
    }
    @Test public void depositMoney1Test(){
        myAccount.deposit(4_000);
        int balance = myAccount.getBalance();
        assertEquals(4_000, balance);
    }
    @Test public void depositMoney2Test(){
        myAccount.deposit(-2_000);
        int balance = myAccount.getBalance();
        assertEquals(0, balance);
    }
    @Test public void withDrawMoneyTest(){
        myAccount.deposit(5_000);
        myAccount.withDraw(3_000);
        int balance = myAccount.getBalance();
        assertEquals(2_000, balance);
    }
    @Test public void withDrawMoney1Test(){
        myAccount.deposit(5_000);
        myAccount.withDraw(6_000);
        int balance = myAccount.getBalance();
        assertEquals(5_000, balance);
    }
   /* @Test public void withDrawMoneyTest2(){
        myAccount.deposit(5_000);
        myAccount.withDraw(-2_000);
        int balance = myAccount.getBalance();
        assertEquals(5_000, balance);
    }
    */
}
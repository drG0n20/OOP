package Account;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    //test for default account
    @Test
    public void getdefaultIDandNameandBalanceTest() {
        Account account = new Account("KW2345", "Kowalski");
        Assert.assertEquals("KW2345", account.getID());
        Assert.assertEquals("Kowalski", account.getName());
        Assert.assertEquals(0, account.getBalance());
    }

    @Test
    public void defaultCreditTest() {
        Account account = new Account("KW2345", "Kowalski");
        Assert.assertEquals(2000, account.credit(2000));
    }

    @Test
    public void defaultDebitTest() {
        Account account = new Account("KW2345", "Kowalski");
        Assert.assertEquals(0, account.debit(5000));
    }

    @Test
    public void defaultTransferTest() {
        Account account1 = new Account("KW001", "Kowalski");
        Account account2 = new Account("KW002", "Nowak");
        Assert.assertEquals(0, account1.transferTo(account2, 1000));
        Assert.assertEquals(0, account1.getBalance());
        Assert.assertEquals(0, account2.getBalance());
    }

    @Test
    public void defaultToStringTest() {
        Account account = new Account("KW2345", "Kowalski");
        Assert.assertEquals("Account[id=KW2345, name=Kowalski, balance=0]", account.toString());
    }

    //test for account with balance
    @Test
    public void getIDandNameandBalanceTest() {
        Account account = new Account("KW2345", "Kowalski", 2300);
        Assert.assertEquals("KW2345", account.getID());
        Assert.assertEquals("Kowalski", account.getName());
        Assert.assertEquals(2300, account.getBalance());
    }

    @Test
    public void creditTest() {
        Account account = new Account("KW2345", "Kowalski", 2300);
        Assert.assertEquals(2502300, account.credit(2500000));
    }

    @Test
    public void debitExceedBalanceTest() {
        Account account = new Account("KW2345", "Kowalski", 2300);
        Assert.assertEquals(2300, account.debit(5000));
    }

    @Test
    public void debitSmallerThanBalanceTest() {
        Account account = new Account("KW2345", "Kowalski", 2300);
        Assert.assertEquals(2200, account.debit(100));
    }

    @Test
    public void transferToExceedTest() {
        Account account1 = new Account("KW001", "Kowalski", 1000);
        Account account2 = new Account("KW002", "Nowak", 0);
        Assert.assertEquals(0, account1.transferTo(account2, 1000));
        Assert.assertEquals(0, account1.getBalance());
        Assert.assertEquals(1000, account2.getBalance());
    }

    @Test
    public void transferToSmallerThanBalanceTest() {
        Account account1 = new Account("KW001", "Kowalski", 1000);
        Account account2 = new Account("KW002", "Nowak", 0);
        Assert.assertEquals(950, account1.transferTo(account2, 50));
        Assert.assertEquals(950, account1.getBalance());
        Assert.assertEquals(50, account2.getBalance());
    }

    @Test
    public void toStringTest() {
        Account account = new Account("KW2345", "Kowalski", 2300);
        Assert.assertEquals("Account[id=KW2345, name=Kowalski, balance=2300]", account.toString());
    }
}

package Account;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void toStringTest() {
        Account account = new Account("ajdi", "Kowalski", 2300);
        Assert.assertEquals("Account[id=ajdi, name=Kowalski, balance=2300]", account.toString());
    }
}

package solidus;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolidusTest {

    @Test
    public void testStartBalance() {
        User user = new User();
        assertEquals(5, user.getBalance());
    }
    @Test
    public void testGoldMembershipAddsSolidus() {
        User user = new User();
        user.becomeGoldMember();
        assertEquals(25, user.getBalance());
    }
    @Test
    public void testLoginAddsSolidus() {
        User user = new User();
        user.login();
        assertEquals(6, user.getBalance());
    }
    @Test
    public void testWithdrawSolidus() {
        User user = new User();
        boolean success = user.withdraw(3);
        assertTrue(success);
        assertEquals(2, user.getBalance());
    }

    @Test
    public void testPurchaseHoodie() {
        User user = new User();
        user.becomeGoldMember();  // Add 20 solidus
        boolean success = user.purchase("hoodie");
        assertTrue(success);
        assertEquals(5, user.getBalance());
    }
}

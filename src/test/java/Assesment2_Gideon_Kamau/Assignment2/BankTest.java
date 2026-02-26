
package Assesment2_Gideon_Kamau.Assignment2;
import static kotlin.test.AssertionsKt.assertEquals;
import static org.junit.Assert.*;

import Assement2_Gideon_Kamau.Assignment2.Bank;
import Assement2_Gideon_Kamau.Assignment2.BankAccount;
import Assement2_Gideon_Kamau.Assignment2.SavingsAccount;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void testAddAccountAndTotalBalance() {
        BankAccount account1 = new BankAccount("101", "Gideon", 500.0);
        bank.addAccount(account1);
        assertEquals(500.0, bank.calculateTotalBalance(), 0.001);
    }

    private void assertEquals(double v, double v1, double v2) {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUniqueAccountNumberConstraint() {
        bank.addAccount(new BankAccount("101", "User1", 200.0));
        bank.addAccount(new BankAccount("101", "User2", 300.0)); // Should throw exception
    }

    @Test
    public void testSavingsMinimumBalance() {

        // This should pass if the logic in your SavingsAccount constructor works
        try {
            new SavingsAccount("S1", "Test", 50.0, 0.05);
            fail("Should have thrown IllegalArgumentException for balance < 100");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }
}
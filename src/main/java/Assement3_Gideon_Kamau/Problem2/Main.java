package Assement3_Gideon_Kamau.Problem2;

import Assement3_Gideon_Kamau.Problem2.Exceptions.AccountNotFoundException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InsufficientFundsException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InvalidTransactionException;

public class Main {

    public static void main(String[] args) {

        try {
            // Setup accounts
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);

            // Add them to the bank's list so they can be "found"
            Bank.getAccounts().add(account1);
            Bank.getAccounts().add(account2);

            // 1. Trigger InvalidTransactionException
            System.out.println("Testing negative deposit...");
            account1.deposit(-100);

            // 2. Trigger InsufficientFundsException
            System.out.println("Testing over-withdrawal...");
            account1.withdraw(2000);

            // 3. Trigger AccountNotFoundException
            System.out.println("Testing invalid transfer target...");
            // Calling the transfer through the bank or account logic
            Bank.transfer("ACC001", "INVALID", 100);

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            // This handles the negative deposit/withdrawal requirement
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            // This handles both the "Invalid ID" and "Non-existent account" requirements
            System.out.println("Account error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            // This block executes regardless of whether an exception occurred
            System.out.println("Transaction processing completed");
        }
    }

}

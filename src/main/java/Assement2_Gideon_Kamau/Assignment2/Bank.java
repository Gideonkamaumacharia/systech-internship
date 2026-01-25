package Assement2_Gideon_Kamau.Assignment2;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    //Collection of BankAccounts

    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                throw new IllegalArgumentException("Account number must be unique.");
            }
        }
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }

    public double calculateTotalBalance() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    public void applyInterestToSavingsAccounts() throws InvalidAmountException {
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        }
    }
}


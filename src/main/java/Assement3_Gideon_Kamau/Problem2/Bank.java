package Assement3_Gideon_Kamau.Problem2;

import Assement3_Gideon_Kamau.Problem2.Exceptions.AccountNotFoundException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InsufficientFundsException;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    /*
    * We have our class Bank here --> its going to have a list of bank accounts
    * The assessment required me have transfer(toAccount, amount) method which then means I should have at least 2 accounts(account to transfer from & account to transfer to)
    *Therefore I modified the method to :transfer(fromAccount, toAccount, amount)
    * cuz of the AccountNotFoundException, I needed to create a method to find an account so if its not found,the exception is thrown
    *
    * */

    private static List<BankAccount> accounts = new ArrayList<>();

    public static BankAccount findAccount(String accountNumber) throws AccountNotFoundException {
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        throw new AccountNotFoundException("Account not found!");
    }

    public static List<BankAccount> getAccounts() {
        return accounts;
    }

    //method to transfer from one account to the other
    public static void transfer(String fromAccountNumber,String toAccountNumber,double amount) throws AccountNotFoundException, InsufficientFundsException {
        BankAccount account = new BankAccount();

        BankAccount accountNumberToTransferFrom = findAccount(fromAccountNumber);
        BankAccount accountNumberToTransferTo = findAccount(toAccountNumber);

        accountNumberToTransferFrom.withdraw(amount);
        accountNumberToTransferTo.deposit(amount);

        System.out.println("Transfer successful!");


    }
}

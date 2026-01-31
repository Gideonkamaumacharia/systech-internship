package Assement3_Gideon_Kamau.Problem2;


import Assement3_Gideon_Kamau.Problem2.Exceptions.AccountNotFoundException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InsufficientFundsException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InvalidAccountNumberException;
import Assement3_Gideon_Kamau.Problem2.Exceptions.InvalidTransactionException;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) throws InvalidAccountNumberException {
        this.setAccountNumber(accountNumber);
        this.setAccountHolder(accountHolder);
        this.setBalance(balance);
    }

    public BankAccount(){}

    public static void main(String[] args) throws InsufficientFundsException, InvalidAccountNumberException {
        BankAccount account = new BankAccount("0796006","Mhusika",780);

        System.out.println("Your new balance is $"+account.getBalance());
        account.deposit(370);
        account.withdraw(400);
        account.withdraw(204);

        //account.withdraw(547); //--> this throws an exception coz we are withdrawing more than the account has
        System.out.println(account.toString());


    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws InvalidAccountNumberException {

        if (accountNumber == null || accountNumber.trim().isEmpty())
            throw new InvalidAccountNumberException("Invalid account number");
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty())
            throw new IllegalArgumentException("Invalid account holder");
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
//        if (balance < 0)
//            throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    public void deposit(double amount)  {
        if (amount <= 0)
            throw new InvalidTransactionException("Deposit must be positive");
        this.balance += amount;
        System.out.println("Deposited $" + amount + ". Your new Balance is $" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0)
            throw new InvalidTransactionException("Withdrawal must be positive");
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Your new Balance is $" + balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds!Tried to withdraw more than is in the account!");
        }
    }

    public void transfer(String toAccountNumber, double amount)
            throws AccountNotFoundException, InsufficientFundsException {

        // Uses the static method from Bank to find the target
        BankAccount target = Bank.findAccount(toAccountNumber);

        this.withdraw(amount);
        target.deposit(amount);
    }



    @Override
    public String toString(){
        System.out.println("Overriding the toString() in Object class");
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}



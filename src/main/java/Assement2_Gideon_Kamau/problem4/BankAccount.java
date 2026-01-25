package Assement2_Gideon_Kamau.problem4;


public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public static void main(String[] args) {
        Assement2_Gideon_Kamau.problem4.BankAccount account = new Assement2_Gideon_Kamau.problem4.BankAccount("7586695","Lucy",780);

        System.out.println("Your new balance is $"+account.getBalance());
        account.deposit(370);
        account.withdraw(400);
        account.withdraw(204);

        //account.withdraw(547); //--> this throws an exception coz we are withdrawing more than the account has


    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty())
            throw new IllegalArgumentException("Invalid account number");
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

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit must be positive");
        this.balance += amount;
        System.out.println("Deposited $" + amount + ". Your new Balance is $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal must be positive");
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Your new Balance is $" + balance);
        } else {
            throw new IllegalArgumentException("Insufficient funds!");
        }
    }
}

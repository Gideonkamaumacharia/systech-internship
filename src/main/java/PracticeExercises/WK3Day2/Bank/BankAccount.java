package PracticeExercises.WK3Day2.Bank;

public class BankAccount {
    public static  int totalAccounts;
    public static final String BANK_NAME= "ABC";
    public static double interestRate;

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number cannot be null");
        }
        if (accountNumber.length() < 5 || accountNumber.length() > 10) {
            throw new IllegalArgumentException("Account number must be 5-10 characters");
        }
        this.accountNumber = accountNumber;

        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder name is required");
        }
        this.accountHolder = accountHolder;

        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance must be zero or more");
        }
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

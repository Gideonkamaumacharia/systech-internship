package Assement2_Gideon_Kamau.problem4;


public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("C999", "Bob", 100, 200);

        checkingAccount.withdraw(150);
        checkingAccount.withdraw(100);

        // checkingAccount.withdraw(100); // This fails coz withdrawal exceeds the -$200 overdraft limit
    }

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);

        if (overdraftLimit > 0) {
            this.overdraftLimit = -overdraftLimit;
        } else {
            this.overdraftLimit = overdraftLimit;
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive!");
        }
        double currentBalance = getBalance();
        double potentialBalance = currentBalance - amount;

        if (potentialBalance >= overdraftLimit) {

            setBalance(potentialBalance);
            System.out.println("Checking Withdrawn: $" + amount + ". New Balance: $" + getBalance());
        } else {
            throw new IllegalArgumentException("Withdrawal denied: Exceeds overdraft limit of $" + (-overdraftLimit));
        }
    }



}


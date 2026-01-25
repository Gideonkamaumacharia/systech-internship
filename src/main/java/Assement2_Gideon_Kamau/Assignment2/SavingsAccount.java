package Assement2_Gideon_Kamau.Assignment2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        if (balance < 100) {
            throw new IllegalArgumentException("Savings account requires minimum balance of $100.");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Withdrawal must be positive") ;

        double potentialBalance = getBalance() - amount;

        if (potentialBalance >= 100) {
            setBalance(potentialBalance);
            System.out.println("Savings Withdrawn $" + amount + ". Your remaining balance is $" + getBalance());
        } else {
            throw new IllegalArgumentException("Withdrawal denied.Must maintain $100 minimum balance.");
        }
    }

    public void applyInterest() throws InvalidAmountException {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied at rate " + (interestRate * 100) + "%. Your interest is $" + interest);
    }

    public static void main(String[] args) {

        Assement2_Gideon_Kamau.problem4.SavingsAccount sa = new Assement2_Gideon_Kamau.problem4.SavingsAccount("S123", "Joy", 500, 0.05);

        sa.withdraw(400);
        sa.applyInterest();

//        sa.withdraw(20);  // This would fail because balance would drop to 90
    }
}


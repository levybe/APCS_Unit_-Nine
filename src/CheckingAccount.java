public class CheckingAccount extends BankAccount
{
    private static final double TRANSACTION_FEE = 0.50;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount)  {
        super.deposit(amount - TRANSACTION_FEE);
    }

    public void withdraw(double amount)  {
        if (amount <= getBalance() - TRANSACTION_FEE) {
            super.withdraw(amount + TRANSACTION_FEE);
        }
    }

    public void transfer(double amount, BankAccount other)  {
        if (amount <= getBalance() - TRANSACTION_FEE) {
            super.withdraw(amount + TRANSACTION_FEE);
            other.deposit(amount);
        }
    }
}

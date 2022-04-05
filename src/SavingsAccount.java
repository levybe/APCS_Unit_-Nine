/**
 *       <<< THIS CODE IS NOT COMPLETE >>>
 *   An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 10;

    public SavingsAccount(double rate)  {
        super(10);
        interestRate = rate;
    }

    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        if (getBalance() < 10) {
            super.deposit(10 - getBalance());
        }
        interestRate = rate;
    }

    public void addInterest()   {
        super.deposit(getBalance() * interestRate);
    }

    public void withdraw(double amount)  {
        if (getBalance() - amount > MINIMUM_BALANCE) {
            super.withdraw(amount);
        }
    }
}


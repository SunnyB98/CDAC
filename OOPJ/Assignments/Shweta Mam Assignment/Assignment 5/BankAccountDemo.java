class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount + ", New Balance: Rs." + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance-amount;
            System.out.println("Withdrawn: Rs." + amount + ", New Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double balance, double withdrawalLimit) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded. Limit: Rs." + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }
}
   
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000, 5000);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(6000);  // Exceeds limit
        savingsAccount.withdraw(4000);  // Allowed
    }
}
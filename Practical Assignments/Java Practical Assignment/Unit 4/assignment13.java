class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount + ", Balance: Rs " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount + ", Balance: Rs " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        
        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
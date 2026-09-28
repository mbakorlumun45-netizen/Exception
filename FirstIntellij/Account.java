package bankApplication;

public class Account {

    private int balance;
    private int pin;

    public Account(int pin) {
        if (pin < 1000 || pin > 9999) {
            throw new IllegalArgumentException("PIN must be a 4-digit number");
        }
        this.pin = pin;
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount, int enteredPin) {
        if (enteredPin != pin) {
            throw new IllegalArgumentException("Incorrect PIN");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }

    public int getBalance(int enteredPin) {
        if (enteredPin != pin) {
            throw new IllegalArgumentException("Incorrect PIN");
        }
        return balance;
    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin != pin) {
            throw new IllegalArgumentException("Incorrect PIN");
        }
        if (newPin < 1000 || newPin > 9999) {
            throw new IllegalArgumentException("PIN must be a 4-digit number");
        }
        pin = newPin;
    }
}
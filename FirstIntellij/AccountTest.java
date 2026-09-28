package bankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    private final int pin = 1234;

    @BeforeEach
    void setUp() {
        account = new Account(pin);
    }

    @Test
    void newAccountHasZeroBalance() {
        assertEquals(0, account.getBalance(pin));
    }

    @Test
    void depositIncreasesBalance() {
        account.deposit(100);
        assertEquals(100, account.getBalance(pin));
    }

    @Test
    void withdrawWithCorrectPinDecreasesBalance() {
        account.deposit(200);
        account.withdraw(50, pin);
        assertEquals(150, account.getBalance(pin));
    }

    @Test
    void withdrawWithWrongPinThrowsException() {
        account.deposit(200);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(50, 9999));
    }

    @Test
    void withdrawMoreThanBalanceThrowsException() {
        account.deposit(50);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100, pin));
    }

    @Test
    void checkBalanceWithCorrectPinDisplaysBalance() {
        account.deposit(300);
        assertEquals(300, account.getBalance(pin));
    }

    @Test
    void checkBalanceWithWrongPinThrowsException() {
        account.deposit(300);
        assertThrows(IllegalArgumentException.class, () -> account.getBalance(9999));
    }

    @Test
    void changePinWithCorrectOldPinUpdatesPin() {
        account.changePin(pin, 4321);
        assertEquals(0, account.getBalance(4321));
    }

    @Test
    void changePinWithWrongOldPinThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.changePin(9999, 4321));
    }

    @Test
    void changePinToInvalidPinThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.changePin(pin, 12));
    }
}
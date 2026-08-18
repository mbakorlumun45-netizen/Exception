import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest {

    @Test
    public void testThatVisaCardStartWithFour() {

        int actual = CreditCardValidator.cardType("47896543215678");

        int expected = 4;

        assertEquals(expected, actual);
    }
}

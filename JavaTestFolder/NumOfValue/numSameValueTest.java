import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class numSameValueTest{

    @Test
    public void testThatFourConsercutiveNumbersAreInAnArrays(){

        numSameValue MiPopCorn = new numSameValue();

        int[] numbers = {2, 7, 5, 5, 5, 5, 9};

        assertEquals(true,  numSameValue.isConsercutiveFour(numbers));
        }
   }   

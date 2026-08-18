import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class listOneListTwoTest{

@Test
public void testThatATwoListOfArraysAreEqualOrNot(){

    listOneListTwo miCupCake = new listOneListTwo();

    int[] listOne  = {2, 5, 7, 9, 3};

    int[] listTwo = {9, 6, 7, 12, 8};

    assertEquals(false, listOneListTwo.twoList(listOne, listTwo));
}
}

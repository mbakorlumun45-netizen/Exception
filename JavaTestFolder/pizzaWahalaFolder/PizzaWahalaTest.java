import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class PizzaWahalaTest{

    @Test
    public void ShouldCalculateOrderFor45GuestBuyingOdogwuPizza(){
        Calculator pizza = new Calculator();
        PizzaOrder order = pizza.calculate(50, PizzaType.ODOGWU);

         assertEquals(5, order.getNumberOfBoxes());
         assertEquals(10, order.getLeftOverSlices());
         assertEquals(26,000, order.getTotalPrices());
    }
}

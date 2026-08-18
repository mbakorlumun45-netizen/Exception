public class Calculator {

    public PizzaOrder calculate(int numberOfGuest, PizzaType pizzaType) {

        if (numberOfGuest <= 0) {
            throw new IllegalArgumentException(
                "Number of guest must be greater than zero, Enter a valid number:"
            );
        }

        int slicesPerBox = pizzaType.getSlicesPerBox();
        int pricesPerBox = pizzaType.getPricesPerBox();

        int numberOfBoxes =
            (numberOfGuest + slicesPerBox - 1) / slicesPerBox;

        int totalSlices = numberOfBoxes * slicesPerBox;

        int leftOverSlices = totalSlices - numberOfGuest;

        int totalPrice = numberOfBoxes * pricesPerBox;

        return new PizzaOrder(
            numberOfBoxes,
            leftOverSlices,
            totalPrice
        );
    }
}

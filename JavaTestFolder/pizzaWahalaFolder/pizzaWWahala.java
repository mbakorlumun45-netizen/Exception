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

public enum PizzaType {

    SAPA_SIZE(2, 500),
    SMALL_SIZE(2, 900),
    BIG_BOY(4, 4000),
    ODOGWU(12, 5200);

    private final int slicesPerBox;
    private final int pricesPerBox;

    PizzaType(int slicesPerBox, int pricesPerBox) {
        this.slicesPerBox = slicesPerBox;
        this.pricesPerBox = pricesPerBox;
    }

    public int getSlicesPerBox() {
        return slicesPerBox;
    }

    public int getPricesPerBox() {
        return pricesPerBox;
    }
}

public class PizzaOrder{

    private final int numberOfBoxes;
    private final int leftOverSlices;
    private final int totalPrices;

public PizzaOrder(int numberOfBoxes, int leftOverSlices, int totalPrices){
this.numberOfBoxes = numberOfBoxes;
this.leftOverSlices = leftOverSlices;
this.totalPrices = totalPrices;
}

public int getNumberOfBoxes(){
    return numberOfBoxes;
}

public int getLeftOverSlices(){
    return leftOverSlices;    
}

public int getTotalPrices(){
    return totalPrices;
}
}

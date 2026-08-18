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

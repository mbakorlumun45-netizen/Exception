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

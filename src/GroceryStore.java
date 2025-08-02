public enum GroceryStore {

    APPLE(3.5, "Apple"),
    CHEESE(5, "Cheese"),
    WATER_BOTTLE(3, "Water Bottle"),
    OIL_CAN(10, "Oil Can"),
    SUGAR(7, "Sugar");

    private final double price;
    private final String name;

    GroceryStore(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

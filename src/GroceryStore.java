public enum GroceryStore {

    APPLE(1, "Apple"),
    CHEESE(5, "Cheese"),
    WATER_BOTTLE(3, "Water Bottle"),
    OIL_CAN(10, "Oil Can"),
    SUGAR(7, "Sugar");

    private final int price;
    private final String name;

    GroceryStore(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
}

package SundayTasks.ClassesAndModifiers;

public class Bed {
    private double height;
    private int pillows;
    private String sheetColor;
    private double price;

    public Bed(double height, int pillows, String sheetColor, double price) {
        this.height = height;
        this.pillows = pillows;
        this.sheetColor = sheetColor;
        this.price = price;
    }

    public Bed(double hight, String sheetColor, double price) {
        this.height = height;
        this.pillows = 1;
        this.sheetColor = sheetColor;
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public double getPrice() {
        return price;
    }
}

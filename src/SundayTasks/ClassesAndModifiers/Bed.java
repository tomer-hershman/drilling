package SundayTasks.ClassesAndModifiers;

public class Bed {
    private double height;
    private int pillows;
    private String sheetColor;

    public Bed(double height, int pillows, String sheetColor) {
        this.height = height;
        this.pillows = pillows;
        this.sheetColor = sheetColor;
    }
    public Bed (double hight, String sheetColor) {
        this.height = height;
        this.pillows = 1;
        this.sheetColor = sheetColor;
    }
    public double getHeight(){
        return height;
    }
    public int getPillows() {
        return pillows;
    }
    public String getSheetColor() {
        return sheetColor;
    }
}

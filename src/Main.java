import SundayTasks.ClassesAndModifiers.*;

public class Main {
    public static void main(String[] args) {
         Bed bed = new Bed(GeneralConstants.myBedHeight,
                          GeneralConstants.myPillowsCount,
                          GeneralConstants.mySheetColor,
                          GeneralConstants.myBedPrice);
        Closet closet = new Closet(new Shirt[]{
                new Shirt("red", 42),
                new Shirt("blue", 38),
                new Shirt("green", 40)
        });
        Room room = new Room(bed, closet);

    }
}

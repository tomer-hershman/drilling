import SundayTasks.ClassesAndModifiers.*;

public class Main {
    public static void main(String[] args) {
         Bed bed = new Bed(GeneralConstants.myBedHeight,
                          GeneralConstants.myPillowsCount,
                          TomerConstants.favoriteColor,
                          GeneralConstants.myBedPrice);
        Closet closet = new Closet(new Shirt[]{
                new Shirt("red", 18),
                new Shirt("blue", 16),
                new Shirt("green", 12)
        });
        Room room = new Room(bed, closet);
        System.out.println("shirts that fit me: ");
        Shirt[] shirts = room.getCloset().getShirtBySize(TomerConstants.shirtSize);
        for (Shirt shirt : shirts) {
            System.out.println(shirt.getColor() + " shirt of size " + shirt.getSize());
        }

        if(HelperClass.isInTolerance(bed.getPrice(),TomerConstants.befPriceTolerance,TomerConstants.maxBedPrice)){
            System.out.println("The bed price is within the acceptable range.");
        } else {
            System.out.println("The bed price is outside the acceptable range.");
        }

    }
}

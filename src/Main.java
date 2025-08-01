import SandayTasks.Records.RecordConstants;
import SandayTasks.Records.RecordsHelperClass;
import SandayTasks.Records.Student;
import SundayTasks.ClassesAndModifiers.*;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(ClassesAndModifiersConstants.myBedHeight,
                ClassesAndModifiersConstants.myPillowsCount,
                TomerConstants.favoriteColor,
                ClassesAndModifiersConstants.myBedPrice);
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

        if (HelperClass.isInTolerance(bed.getPrice(), TomerConstants.befPriceTolerance, TomerConstants.maxBedPrice)) {
            System.out.println("The bed price is within the acceptable range.");
        } else {
            System.out.println("The bed price is outside the acceptable range.");
        }
        // create 60 sample students records in an array
        Student[] students = new Student[60];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student " + (i + 1), (i % 4) + 9, (i % 3) + 1);
        }

    }
}

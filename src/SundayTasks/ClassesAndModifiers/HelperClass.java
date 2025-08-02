package SundayTasks.ClassesAndModifiers;

public class HelperClass {
    protected static Shirt[] addShirtToList(Shirt[] shirtList, Shirt shirt) {
        Shirt[] newShirtList = new Shirt[shirtList.length + 1];
        for (int i = 0; i < shirtList.length; i++) {
            newShirtList[i] = shirtList[i];
        }
        newShirtList[newShirtList.length-1] = shirt;
        return newShirtList;
    }

    public static boolean isInTolerance(double value, double tolerance, double wantedValue) {
        return (Math.abs(value - wantedValue) <= Math.abs(tolerance));
    }
}

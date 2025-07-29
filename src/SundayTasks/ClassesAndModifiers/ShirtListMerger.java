package SundayTasks.ClassesAndModifiers;

public class ShirtListMerger {
    protected static Shirt[] addShirtToList(Shirt[] shirtList, Shirt shirt) {
        Shirt[] newShirtList = new Shirt[shirtList.length + 1];
        for (int i = 0; i < shirtList.length; i++) {
            newShirtList[i] = shirtList[i];
        }
        newShirtList[-1] = shirt;
        return newShirtList;
    }
}

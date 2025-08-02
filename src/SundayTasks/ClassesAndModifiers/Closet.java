package SundayTasks.ClassesAndModifiers;

public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] shirts) {
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtsBySize(int size) {
        int ShirtsTheRightSize = 0;
        for (Shirt shirt : shirts) {
            if (shirt.getSize() == size) {
                ShirtsTheRightSize++;
            }
        }
        Shirt[] finalShirtList = new Shirt[ShirtsTheRightSize];
        for (int i = 0, j = 0; i < shirts.length; i++) {
            if (shirts[i].getSize() == size) {
                finalShirtList[j++] = shirts[i];
            }
        }
        return finalShirtList;
    }
    public void addShirtToCloset(Shirt shirt){
        HelperClass.addShirtToList(shirts, shirt);
    }
}

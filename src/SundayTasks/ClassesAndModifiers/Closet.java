package SundayTasks.ClassesAndModifiers;

public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] shirts) {
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtBySize(int size) {
        int index = 0;
        for (Shirt shirt : shirts) {
            if (shirt.getSize() == size) {
                index++;
            }
        }
        Shirt[] finalShirtList = new Shirt[index];
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

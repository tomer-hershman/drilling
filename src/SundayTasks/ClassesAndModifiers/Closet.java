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
        Shirt[] shirtList = new Shirt[shirts.length];
        int index = 0;
        for (Shirt shirt : shirts) {
            if (shirt.size == size) {
                shirtList[index] = shirt;
                index++;
            }
        }
        Shirt[] finalShirtList = new Shirt[index];
        for (int i = 0; i < index; i++) {
            finalShirtList[i] = shirtList[i];
        }
        return finalShirtList;
    }
    public void addShirtToCloset(Shirt shirt){
        ShirtListMerger.addShirtToList(shirts, shirt);
    }
}

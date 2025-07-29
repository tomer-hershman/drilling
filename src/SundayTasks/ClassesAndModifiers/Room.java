package SundayTasks.ClassesAndModifiers;

public class Room {
    private Bed bed;
    private Closet closet;

    public Room(Bed bed, Closet closet) {
        this.bed = bed;
        this.closet = closet;
    }

    public Room(Bed bed, Shirt[] shirts) {
        this.bed = bed;
        this.closet = new Closet(shirts);
    }
    public Bed getBed() {
        return bed;
    }
    public Closet getCloset() {
        return closet;
    }
}

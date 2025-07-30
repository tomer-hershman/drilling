package polymorphisem;

public class SpangeBob extends Fish {

    public SpangeBob(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    void goToWork() {
        walkByFoot();
    }
}

package poly.polymorphisem;

public class SpangeBob extends Fish implements BasketballPlayer {

    public SpangeBob(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    void goToWork() {
        walkByFoot();
    }
    @Override
    public void playBasketball() {
        System.out.println("SpangeBob plays basketball");
    }
}

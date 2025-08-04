package poly.polymorphisem;

public class SpongeBob extends Fish implements BasketballPlayer {

    public SpongeBob(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    public void goToWork() {
        walkByFoot();
    }
    @Override
    public void playBasketball() {
        System.out.println("SpangeBob plays basketball");
    }
}

package poly.polymorphisem;

public class SpongeBobTheCook extends SpongeBob{
    public SpongeBobTheCook(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
        super.playBasketball();
    }

    @Override
    public void playBasketball() {
        System.out.println("SpangeBob the Cook plays basketball with a spatula!");
    }
}

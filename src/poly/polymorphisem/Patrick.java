package poly.polymorphisem;

public class Patrick extends Fish implements BasketballPlayer {

    public Patrick(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    public void goToWork() {
        takeTheTrain();
    }
    @Override
    public void playBasketball() {
        System.out.println("Patrick plays basketball");
    }
}

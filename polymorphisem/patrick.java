package polymorphisem;

public class patrick extends Fish implements BasketballPlayer {

    public patrick(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    void goToWork() {
        takeTheTrain();
    }
    @Override
    public void playBasketball() {
        System.out.println("Patrick plays basketball");
    }
}

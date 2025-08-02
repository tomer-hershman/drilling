package poly.polymorphisem;

public class MrKrab extends Fish{
    public MrKrab(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    void goToWork() {
        takeTheCar();
    }
}

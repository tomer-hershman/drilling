package polymorphisem;

public class patrick extends Fish {

    public patrick(int age, String name, String favoriteFood) {
        super(age, name, favoriteFood);
    }

    @Override
    void goToWork() {
        takeTheTrain();
    }
}

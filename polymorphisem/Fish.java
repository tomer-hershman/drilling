package polymorphisem;

public abstract class Fish {
    int age;
    String name;
    String favoriteFood;

    public Fish(int age, String name, String favoriteFood) {
        this.age = age;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    void takeTheCar() {
        System.out.println("Fish takes the car");
    }

    void takeTheTrain() {
        System.out.println("Fish takes the train");
    }

    void walkByFoot() {
        System.out.println("Fish walks by foot");
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getFavoriteFood() {
        return favoriteFood;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

}

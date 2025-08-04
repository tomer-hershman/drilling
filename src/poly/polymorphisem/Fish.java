package poly.polymorphisem;

public abstract class Fish {
    int age;
    String name;
    String favoriteFood;

    public Fish(int age, String name, String favoriteFood) {
        this.age = age;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void takeTheCar() {
        System.out.println("takes the car");
    }

    public void takeTheTrain() {
        System.out.println("takes the train");
    }

    public void walkByFoot() {
        System.out.println("walks by foot");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public abstract void goToWork();


}

package poly.polymorphisem;

public class PolyHelperClass {
    public static void basketballPlayerAgenda(BasketballPlayer[] players) {
        for (BasketballPlayer player : players) {
            if (player instanceof Fish) {
                ((Fish) player).goToWork();

            }
            player.playBasketball();
        }
    }
}

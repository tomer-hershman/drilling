package poly.polymorphisem;

import java.util.Arrays;

public class PolyHelperClass {
    public static void basketballPlayerAgenda(BasketballPlayer[] players) {
        for (BasketballPlayer player : players) {
            if (player instanceof Fish fishPlayer) {
                fishPlayer.goToWork();

            }
            player.playBasketball();
        }
    }

    public static void printAgendaForBasketBallFish(Fish[] fish) {
        int BasketBallFishCount = 0;
        for (Fish f : fish) {
            if (f instanceof BasketballPlayer) {
                BasketBallFishCount++;
            }
        }
        BasketballPlayer[] basketballPlayers = new BasketballPlayer[BasketBallFishCount];
        for (int i = 0, j = 0; i < fish.length; i++) {
            if (fish[i] instanceof BasketballPlayer ) {
                basketballPlayers[j++] = (BasketballPlayer) fish[i];
            }

        }
        basketballPlayerAgenda(basketballPlayers);
    }
}
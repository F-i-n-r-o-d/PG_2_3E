package pohorsky.RPG.configs;

public class GameUtils {
    public static int getXpForNextLevel(int targetLevel) {
        return Math.powExact(targetLevel+1, 2)*50+Math.powExact(2, targetLevel+1);
    }
}

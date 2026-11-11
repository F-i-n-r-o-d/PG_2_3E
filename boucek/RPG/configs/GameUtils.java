package boucek.RPG.configs;

public class GameUtils {
    public static int getXpForNextLevel(int targetLevel) {
        return (int) (Math.powExact(targetLevel + 1, 2) * 50 + Math.powExact(2, targetLevel + 1));
    }
}
package straka.RPG.configs;

public class GameUtils {
    public static int getXpForLevel(int targetLevel) {
        return Math.powExact(targetLevel, 2) * 50 + Math.powExact(2, targetLevel);
    }
}

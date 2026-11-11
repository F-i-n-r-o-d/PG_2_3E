package jusko.RPG.confings;

public class GameUtils {
    public static int getXpForNextLevel(int targetlevel){
        return Math.powExact(targetlevel+1, 2)*50+Math.powExact(2, targetlevel+1);
    }
}

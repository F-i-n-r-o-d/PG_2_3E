package solil.RPG.configs;

public class GameUtils{
    public static int gainXpForNextLevel(int level){
        return (int) (Math.pow(level, 2) * 50 + Math.pow(2, level));
    };
}
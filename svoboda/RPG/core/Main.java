package svoboda.RPG.core;

import svoboda.RPG.characters.Ancestry;
import svoboda.RPG.characters.Hero;
import svoboda.RPG.characters.HeroClass;
import svoboda.RPG.configs.GameConfig;
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR         
        );
        System.out.println(hero.getAbilityPoints());
        hero.gainExperience(1000);
        System.out.println(hero.getAbilityPoints());
        System.out.println("Max health: " + GameConfig.MAX_HEALTH);
        System.out.println("Game name: " + GameConfig.GAME_NAME);
    }
}
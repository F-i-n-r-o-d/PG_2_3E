package pasler.RPG.core;

import pasler.RPG.characters.Ancestry;
import pasler.RPG.characters.Hero;
import pasler.RPG.characters.HeroClass;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
        System.out.println(hero.getAbilityPoints());
        hero.gainExperience(1000);
        System.out.println(hero.getAbilityPoints());
    }
}

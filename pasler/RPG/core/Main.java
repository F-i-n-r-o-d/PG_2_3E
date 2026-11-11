package pasler.RPG.core;

import pasler.RPG.characters.Ancestry;
import pasler.RPG.characters.Hero;
import pasler.RPG.characters.HeroClass;

public class Main {
    public static void main(String[] args) {

        IO.println(Hero.getTotalHeroesCreated());
        Hero aragorn = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
        Hero mirecek = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
        IO.println(Hero.getTotalHeroesCreated());
        // System.out.println(hero.getAbilityPoints());
        // hero.gainExperience(1000);
        // System.out.println(hero.getAbilityPoints());
    }
}

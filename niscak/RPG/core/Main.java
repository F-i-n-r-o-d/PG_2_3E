package niscak.RPG.core;

import niscak.RPG.characters.Ancestry;
import niscak.RPG.characters.Hero;
import niscak.RPG.characters.HeroClass;

public class Main {
    public static void main(String[] args) {
        IO.println(Hero.getTotalHeroesCreated());
        Hero aragorn = new Hero("Aragorn", Ancestry.Human, HeroClass.Warrior);
        IO.println(Hero.getTotalHeroesCreated());
        
    }
}
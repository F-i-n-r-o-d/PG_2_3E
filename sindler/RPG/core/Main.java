package sindler.RPG.core;

import sindler.RPG.characters.Ancestry;
import sindler.RPG.characters.Hero;
import sindler.RPG.characters.HeroClass;

public class Main {
    public static void main(String[] args) {
    Hero h1 = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
    h1.gainExperience(1000);
    h1.setHealth(100);
    System.out.println("Hero's health: " + h1.getHealth());
    System.out.println("Hero's name: " + h1.getName());
    System.out.println("Hero's class: " + h1.getHeroClass());
    System.out.println("Hero's ancestry: " + h1.getAncestry());
    System.out.println("Hero's level: " + h1.getLevel());
    System.out.println("Hero's strength: " + h1.getStrength());
    System.out.println("Hero's charisma: " + h1.getCharisma());
    System.out.println("Hero's intelligence: " + h1.getIntelligence());
    }
}